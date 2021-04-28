package week6day3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	Socket c;
	DataInputStream dis;
	DataOutputStream dos;
	
	
	public Client() {
		try {
			c = new Socket("192.168.0.79",5055);
			System.out.println("request server");
			
			dis = new DataInputStream(c.getInputStream());
			dos = new DataOutputStream(c.getOutputStream());
			
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} //대상지정, ip, port
	}
		
		
		
		
	
	//데이터 보내기
	public void sendMsg() {
		Scanner sc = new Scanner(System.in);
		
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				
				
			}
			
		});
		/*try {
			while(true) {
				String msg = sc.nextLine();
				dos.writeUTF(msg);
			}
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}*/
		
		
	}
	//데이터 받기
		public void recvMsg() {
			
			new Thread(new Runnable() {

				@Override
				public void run() {
					
					
				}
				
			});
		
			/*String recvMsg;
			try {
				recvMsg = dis.readUTF();
				System.out.println(recvMsg);
			} catch (IOException e) {
				
				e.printStackTrace();
			}*/
		
			
		}
	

	
	
	
	
	public static void main(String[] args) {
		new Client();
	

	}

}
