package edu;

import java.awt.Toolkit;

public class P524 {

	public static void main(String[] args) {
		P524 p524 = new P524();
		p524.start();
		
	}
	
	public void start() {
		System.out.println("Start");
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i=0; i<5; i++) {
			toolkit.beep();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for (int i=0; i < 5; i++) {
			System.out.println("¶¯");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
