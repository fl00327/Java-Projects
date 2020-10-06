package demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;

public class server {

	public static void main(String[] args)throws IOException {
		try {
		ServerSocket sock = new ServerSocket(6013);
		
		while(true) {
			System.out.println("Server Started");
			System.out.println("Waiting For Clients");
			Socket client = sock.accept();
			PrintWriter print = new PrintWriter(client.getOutputStream(),true);
			
			print.println(new java.util.Date().toString());
			sock.close();
		}
		}
		catch(IOException ioe) {
			System.err.println(ioe);
		}
		
	}

}
