package edu;

public class TestFor {
	public static void main(String[] args) {
		TestFor testFor = new TestFor();
		//testFor.init();
		testFor.print3();
	}
	
	void init() {
		//adding 1 to 100
		
		int result = 0;
		int result2 = 0;
		int result3 = 0;
		int result4 = 0;
		for (int pp = 1; pp < 101; pp++) {
			result +=pp;
			if (pp % 2 == 0) {
				result2 += pp;
			}
			if (pp % 2 != 0) {
				result3 += pp;
			}
		}
		System.out.println("Sum is " + result);
		System.out.println("Sum is " + result2);
		System.out.println("Sum is " + result3);
		
		
		// 3과 13의 최소공배수만 더하기
		for (int pp = 1; pp < 101; pp++) {
			if (pp %3 == 0 && pp % 3 == 0) {
				result4 += pp;
			}
		
		}System.out.println("Sum is " + result4);
	}
	void print() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void print1() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (i+1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
	}
	
	void print2() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < 4-i) {
				System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
			
	}

	void print3() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9; j++) {
				if (j % 2 != 0) {
					
				}
			System.out.println();
			}
		}
	}
	
	//구구단 출력하기
	void gugu() {
		for (int i = 1; i < 100; i++) {
			for (int j = 1; j < 100; j++) {
				System.out.println(i + "x" + j + "="+ (i*j));
			}
		}
	}

	
	
}
	
