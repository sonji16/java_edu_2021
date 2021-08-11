package edu;

import java.io.IOException;

public class P094 {

	public static void main(String[] args) throws IOException {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			if(keyCode != 13 && keyCode !=10) {
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {
				break;
			}
			}
		}
		
		System.out.println("Á¾·á");
	}

}
