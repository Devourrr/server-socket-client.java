package week6day3.ex;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {
	Socket s;
	DataInputStream i;
	DataOutputStream o;
	
	public Client1() {
		
		try {
			s = new Socket("localhost",5050);
			System.out.println("request server");
			i = new DataInputStream(s.getInputStream());
			o = new DataOutputStream(s.getOutputStream());
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	
		
		
	}
	
	
	public static void main(String[] args) {
		new Client1();

	}

}
