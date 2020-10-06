package demo;

import java.io.*;
import java.net.*;

public class client {

	public static void main(String[] args)throws IOException {
		Socket sock = null;
		InputStream in = null;
		BufferedReader bin = null;
		
		try {
		 sock = new Socket("127.0.0.1",6013);
		 System.out.println("Connected");
		 in = sock.getInputStream();
		 bin = new BufferedReader(new InputStreamReader(in));
		}
		catch (IOException ioe) {
			System.err.println(ioe);
	}
		finally {
			 sock.close();
		}
	}
	

}
