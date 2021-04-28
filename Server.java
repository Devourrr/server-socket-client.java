package week6day3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	ServerSocket sc;
	Socket c;
	DataInputStream dis;
	DataOutputStream dos;
	
	public Server() {
	try {
		sc= new ServerSocket(5055);
		System.out.println("server ready");
		c = sc.accept();
		System.out.println("create client socket");
		
		dis = new DataInputStream(c.getInputStream()); //데이터 수신
		dos = new DataOutputStream(c.getOutputStream()); //데이터 송신
		
	} catch (IOException e) {
		
		
		e.printStackTrace();
	} //포트번호
	
	}

	public static void main(String[] args) {
		
		new Server();

	}

}
