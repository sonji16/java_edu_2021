package edu;

public class Dog {
	//숫자 2개를 입력 받아서 곱해주는 역할
	
	public int multi(int a, int b) {
		return multi(a, b, 1);
		
	}

	
	public int multi(int a, int b, int c) {
		int result = 0;
		
		result = a * b * c;
		
		return result;
	}
}
