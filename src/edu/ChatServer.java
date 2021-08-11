package edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	//final --> 수정 불가
	public static final int PORT = 3001; // constant -- capital letter
	
	// port 1000번대는 주로 시스템이 씀
	
	
	public static void main(String[] args) {
		ChatServer server = new ChatServer();
		server.start();

	}
	
	// Ctrl + Shift + o --> 자동 import (한번에)
	public void start() {
		ServerSocket serverSocket = null;
				
		try {
			serverSocket = new ServerSocket();
			InetAddress inetAddress = InetAddress.getLocalHost(); //내 컴퓨터의 IP 주소를 가져오기
			String localhost = inetAddress.getHostAddress(); // 상대방의 IP 주소 가져오기
			serverSocket.bind(new InetSocketAddress(localhost, PORT));
			
			System.out.println(">> binding " + localhost + "  port: " + PORT);
			
			Socket socket = serverSocket.accept(); // 대기모드
			System.out.println("누군가 접속했다 " + socket.getRemoteSocketAddress());
			chat(socket);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void chat(Socket socket) {
		while(true) {
			InputStream is = null;
			InputStreamReader isr = null;
			BufferedReader br = null;
			
			OutputStream os = null;
			OutputStreamWriter osw = null;
			PrintWriter pw = null;
			
			try {
				is = socket.getInputStream();
				isr = new InputStreamReader(is, "UTF-8");
				br = new BufferedReader(isr);
			
				os = socket.getOutputStream();
				osw = new OutputStreamWriter(os, "UTF-8");
				pw = new PrintWriter(osw);
				
				String msg = br.readLine();
				System.out.println(">> read: " + msg);
				pw.print("echo" + msg);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
