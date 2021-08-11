package edu;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class WebServer {
	public static void main(String args[]) {
		new WebServer().start();
	}
	
	public void start() {
		
		BufferedReader br = null;
		DataOutputStream dos = null;
		
		try {
			System.out.println(">>> Start the Web Server");
			
			//create the server
			ServerSocket ss = new ServerSocket(8989);
			//accept client access
			Socket socket = ss.accept();
			
			System.out.println(">>> 누군가 접속했습니다: " + socket.getRemoteSocketAddress().toString());
			
			//printing the data from InputStream
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			dos = new DataOutputStream(socket.getOutputStream());
			Date date = new Date();
			
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
				
				StringBuilder sb = new StringBuilder();
				while(true) {
					Scanner scan = new Scanner(System.in);
					String msg = scan.nextLine();
					
					if("exit".equals(msg)) {
						scan.close();
						break;
					} else {
						sb.append(msg).append("<br>");
					}
				}
				
				sb.append("\n서버 전송 시간 : " + date.getTime());
				
				
				String img = "<img src = 'https://post-phinf.pstatic.net/MjAyMDAyMjRfMTI0/MDAxNTgyNTE4NTk2NzU4.oS2j4jX-GF9o8-6O8lRCbS9tW8NjyV3-rfRPiQRmHRQg.LUnLCQjsCNafMOfuJQuFD6rns64Svt1_Kcgoz8ERWykg.JPEG/DSC02823.jpg?type=w1200'><hr>";
				String atag = "<a href = 'https://post-phinf.pstatic.net/MjAyMDAyMjRfMTI0/MDAxNTgyNTE4NTk2NzU4.oS2j4jX-GF9o8-6O8lRCbS9tW8NjyV3-rfRPiQRmHRQg.LUnLCQjsCNafMOfuJQuFD6rns64Svt1_Kcgoz8ERWykg.JPEG/DSC02823.jpg?type=w1200'>육성재</a><hr>";
				sb.append(img).append(atag);
				
				String mimeType = "text/html; charset=utf-8";
				dos.writeBytes("HTTP/1.0 200 Document Follows \r\n");
				dos.writeBytes("Content-Type: " + mimeType + "\r\n");
				dos.writeBytes("Content-Length: " + sb.toString().getBytes().length + "\r\n");
				dos.writeBytes("\r\n");
				
				
				dos.writeUTF(sb.toString());
				
				System.out.println(sb.toString());
				
				dos.flush();
				dos.close();
				
				break;
			}
			
			System.out.println(">>> 서버 종료");
			
		}catch(Exception ex1) {
			ex1.printStackTrace();
		}
	}
	
	
}
