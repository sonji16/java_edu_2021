package edu;

import java.util.Scanner;

public class P096 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("Line input: \"" + inputData + "\"");
			if(inputData.equals("q")) {
				break;
			}
		}
		System.out.println("Finish");
	}
}
