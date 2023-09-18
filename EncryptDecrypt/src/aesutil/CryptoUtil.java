package aesutil;

import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author salman
 */
public class CryptoUtil {
   
    private static final byte[] SALT = "7B9yickNBnTRy4bfp2b3Zp0prk8dOTfk".getBytes();
    private static final String TOKEN = "fqJfdzGDvfwbedsKSUGty3VZ9taXxMVw";
    private static final int ITERATION_COUNT = 1024;
    private static final int KEY_STRENGTH = 256;
    private static final byte[] IV = { 0, 2, 0, 4, 0, 4, 0, 1, 0, 1, 0, 3, 0, 9, 0, 1 };
    
    
    public static String encrypt(String data) throws Exception {
        try{
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            KeySpec spec = new PBEKeySpec(TOKEN.toCharArray(), SALT, ITERATION_COUNT, KEY_STRENGTH);
            SecretKey tmp = factory.generateSecret(spec);
            SecretKey key = new SecretKeySpec(tmp.getEncoded(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

            IvParameterSpec ivspec = new IvParameterSpec(IV);

            cipher.init(Cipher.ENCRYPT_MODE, key, ivspec);
            byte[] encryptedData = cipher.doFinal(data.getBytes());
            return Base64.getEncoder().encodeToString(encryptedData);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public static String decrypt(String encryptedData){
        try{
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            KeySpec spec = new PBEKeySpec(TOKEN.toCharArray(), SALT, ITERATION_COUNT, KEY_STRENGTH);
            SecretKey tmp = factory.generateSecret(spec);
            SecretKey key = new SecretKeySpec(tmp.getEncoded(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

            IvParameterSpec ivspec = new IvParameterSpec(IV);
            cipher.init(Cipher.DECRYPT_MODE, key, ivspec);
            byte[] decryptedData = Base64.getDecoder().decode(encryptedData);
            byte[] utf8 = cipher.doFinal(decryptedData);
            return new String(utf8, "UTF8");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
        
    }

    public static void main(String args[]) throws Exception {
      
    	//String encrypted = encrypt("dateOfBirth=01-01-1978&licenseNumber=SL0040818C00002&referenceNumber=SLP67095");
    	String encrypted = encrypt("dateOfBirth=02-02-1980&licenseNumber=BB0003249CTL000");
        System.out.println("Encrypted: " + encrypted);
       // String decrypted = decrypt("mG544WHcHXXkwx8ALKN7czoleutjYC2svNsTosrg3te1ZEjAiD0PbXanVms+W6mGY4IGXIi2t/+tfBg4od9AnQ==");
      //  System.out.println("Decrypted: " + decrypted);
    }
}

