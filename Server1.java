package week6day3.ex;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	
	ServerSocket svscket;
	Socket s;
	DataInputStream dtipstr;
	DataOutputStream dtopstr;
	
	public Server1() {
		
		try {
			svscket = new ServerSocket(5050);
			System.out.println("server ready");
			s = svscket.accept();
			System.out.println("create client socket");
			dtipstr = new DataInputStream(s.getInputStream());
			dtopstr = new DataOutputStream(s.getOutputStream());
		} catch (IOException e) {
			
			e.printStackTrace();
		} // 포트번호
		
		
		
	}
	
	public static void main(String[] args) {

		new Server1();
	}

}
