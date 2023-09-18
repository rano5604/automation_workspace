package biometric;



import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

@SuppressWarnings("serial")
public class FixedSizeDocument extends PlainDocument
{
   private int max = 8;
   
   public FixedSizeDocument(int max) 
   { 
        this.max = max; 
   } 

   @Override
   public void insertString(int offs, String str, AttributeSet a)
      throws BadLocationException
   {

	   
      if (getLength()+str.length()>max)
      {

    	  
         str = str.substring(0, max - getLength());
      }
      super.insertString(offs, str, a);
   }
}