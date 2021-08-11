// �۵� �ȵʤ̤�
package edu;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
	// ����(client)�� IP �ּҿ� PORT �Է�
	public static final int PORT = 9999;
	public static final String IP = "192.168.0.14"; 
	
	public static void main(String[] args) {
		ChatClient client = new ChatClient();
		client.start();
	}
	
	public void start() {
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter osw = null;
		PrintWriter pw = null;
		
	
		Socket socket = new Socket();
		
		try {
			socket.connect(new InetSocketAddress(IP, PORT));
		
		
			is = socket.getInputStream();
			isr = new InputStreamReader(is, "UTF-8");
			br = new BufferedReader(isr);
		
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os, "UTF-8");
			pw = new PrintWriter(osw);
			
			// Ű���忡�� ���ڿ��� �Է� �޾Ƽ� ���� ����
			Scanner scanner = new Scanner(System.in);
			String msg = scanner.nextLine();
			
			
			while(true) {
			if("bye".equals(msg)) {
				//����
			} else {
			
			
			}
			
			pw.print(msg);
			pw.flush();
			System.out.println("msg: " + msg);
			}
		} catch(Exception e) {
			e.getStackTrace();
		}
		
	}
}
