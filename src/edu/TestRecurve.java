package edu;

public class TestRecurve {
	int sum_re = 0;
	
	public static void main(String[] args) {
		TestRecurve test = new TestRecurve();
		test.test();
	}
	
	public void test () {
		
//		add(10);
//		
//		// recursive function #1
//		addRe(10);
//		System.out.println("sum_re: " + sum_re);
//		
//		// recursive function #2 (with return value)
//		int sum = addRe2(10);
//		System.out.println("addRe2: " + sum);
//		
//		// recursive function #3 -- factorial sequence
//		int sum3 = factorial(4);
//		System.out.println("factorial: " + sum3);
		
		// recursive function #4 -- fibonacci sequence
		int sum4 = fibonacci(5);
		System.out.println("fibonacci: " + sum4);
	}
	
	//1부터 s까지의 정수 모두 더하기
	public void add(int s) {
		int sum = 0;
		
		for (int i = s; i > 0 ; i--) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
	
	
	public void addRe(int s) {
		sum_re += s;
		if (s-1 > 0) addRe(s-1);
		
	}
	
	
	public int addRe2(int s) {
		int result = s;
		
		
		if(s > 1) {
			result = s + addRe2(s - 1);
		}else {
			result = s;
		}
		
		return result;
	}
	
	public int factorial(int s) {
		int result = s;
		
		if(s > 1) {
			
			result = (s) * (factorial(s-1));
		} else {
			result = s;
		}
		return result;
	}
	
	public int fibonacci(int s) {
		int result = s;
		
		System.out.println("s result: "+ s);
		if(s > 1) {
			
			result = fibonacci(s-1) + fibonacci(s-2);	
		}
		System.out.println("result: "+ result);
		return result;
	}
}