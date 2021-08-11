package edu;

public class CalAI {

	static Dog dog = new Dog();

	public static int multi(int a, int b) {
		return multi(a, b, 1);
		
	}

	
	public static int multi(int a, int b, int c) {
	
		return dog.multi(a, b, c);
	}
	
	
	
	public static int add(int a, int b) {

		return add(a, b, 0);
	}
	
	public static int add(int a, int b, int c) {
		
		int result = 0;
		result = a + b + c;
		return result;
	}
 }
