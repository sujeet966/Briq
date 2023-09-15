package briq;
import java.net.*;  
import java.io.*;

public class FetchData {
	public static void main(String arg[]) {
		String URL = "https://data.sfgov.org/resource/p4e4-a5a7.json";
		System.out.println(getContent(URL));
		try {
		PrintWriter pw = new PrintWriter(new File("/Users/sueetkumar/Desktop/mycsv"));
		pw.write(getContent(URL));
		}
		catch(Exception e) {  
			System.out.println(e);
		}
	}

	public static String getContent (String URL) {
		StringBuilder content = new StringBuilder();
		try{ 
		URL url=new URL("https://data.sfgov.org/resource/p4e4-a5a7.json");    
		URLConnection conn =  url.openConnection();
		BufferedReader BR = new BufferedReader(new InputStreamReader(conn.getInputStream()));  
	    String line; 
	    while ((line = BR.readLine()) != null)   
	        content.append(line + "\n");  
	      BR.close();  
		}  
		catch(Exception e) {  
		  System.out.println(e);
		}
		return content.toString();
	}
}
		    
