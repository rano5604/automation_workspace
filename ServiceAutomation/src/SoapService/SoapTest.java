package SoapService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;




public class SoapTest {

	String endpoint = "http://192.168.1.31:7025/hsdl/ApplicationService";
	@Test
	public void getSoapResponse() throws ClientProtocolException, IOException
	{
		File requestFile = new File(System.getProperty("user.dir")+"//Request//inactiveapplication.xml");
		
		HttpClient client = HttpClientBuilder.create().build();
		
		HttpPost post = new HttpPost(endpoint);
		post.setEntity(new InputStreamEntity(new FileInputStream(requestFile)));;
		post.setHeader("Content-Type","text/xml");
		
		HttpResponse response = client.execute(post);
		System.out.println(response.getStatusLine().getStatusCode());
		BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		
		String line ="";
		StringBuffer sb = new StringBuffer();
		while((line=br.readLine())!=null){
			sb.append(line);
		
		}
		PrintWriter pw = new PrintWriter(System.getProperty("user.dir")+"//Response//inactiveapplication_res.xml");
		
		pw.write(sb.toString());
		pw.close();
		pw.flush();
	}
}
