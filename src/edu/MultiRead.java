package edu;

import java.util.Scanner;

//It should continue printing
//When a user input something, the contents are changed
public class MultiRead implements Runnable{
	String msg;
	
	public static void main(String[] args) {
		for (int i = 0; i < 100000; i++) {
			MultiRead multiRead = new MultiRead();
			multiRead.start();
		}
	}
	
	
	public void start() {
		Thread thread = new Thread(this);
		thread.start();
		
		}
	


	@Override
	public void run() {
		
		System.out.println("Start");
		
		int ct = 0;
		boolean loop = true;
		while(loop) {
			
			System.out.println(ct + " "  + msg + " Nice to meet you!");
			++ct;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


