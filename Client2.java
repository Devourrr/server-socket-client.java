package week6day3.ex;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {
	Socket s;
	DataInputStream i;
	DataOutputStream o;
	
	public Client2() {
		
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
		dataSend();
		dataRecv();
	
	}
	
	
	public void dataRecv() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				while(true) {
					try {
						String data = "";
						data= i.readUTF();
						System.out.println(data);
					} catch (IOException e) {
						System.out.println("exit");
					}
					
				}
			}	
		}).start();
		
	}


	public void dataSend() {
		Scanner sc = new Scanner(System.in);
		new Thread(new Runnable() {

			@Override
			public void run() {
				
					
						try {
							while(true) {
								String sendData = sc.nextLine();
								o.writeUTF(sendData);
							}
						}catch (IOException e) {
								// TODO Auto-generated catch block
								System.out.println("exit");
						}
					}
				
				
			}).start();
		
	}


	public static void main(String[] args) {
		new Client2();

	}

}
