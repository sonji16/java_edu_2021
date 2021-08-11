// 작동 안됨ㅜㅜ
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
	// 상대방(client)의 IP 주소와 PORT 입력
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
			
			// 키보드에서 문자열을 입력 받아서 서버 전송
			Scanner scanner = new Scanner(System.in);
			String msg = scanner.nextLine();
			
			
			while(true) {
			if("bye".equals(msg)) {
				//종료
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
