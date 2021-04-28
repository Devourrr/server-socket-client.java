package week6day3.ex;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Server2 {
	
	ServerSocket svscket;
	Socket s;
	DataInputStream dtipstr;
	DataOutputStream dtopstr;
	
	public Server2() {
		
		try {
			svscket = new ServerSocket(5050);
			System.out.println("server ready");
			s = svscket.accept();
			System.out.println("create client socket");
			dtipstr = new DataInputStream(s.getInputStream());
			dtopstr = new DataOutputStream(s.getOutputStream());
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		dataSend();
		dataRecv();
		
		
		
	}
	
	private void dataRecv() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				
				try {
					String data = "";
					data = dtipstr.readUTF();
					System.out.println(data);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("exit");
				}
				
				
			}
			
		}).start();
		
	}

	private void dataSend() {
		Scanner sc = new Scanner(System.in);
		
		new Thread(new Runnable() {

		@Override
		public void run() {
			
			try {
				while(true){
					String sendData = sc.nextLine();
					dtopstr.writeUTF(sendData);
			}
				
			}catch (IOException e) {
				System.out.println("exit");
			}
			
				
		}
			
	}).start();
	}
	

	public static void main(String[] args) {

		new Server2();
	}

}
