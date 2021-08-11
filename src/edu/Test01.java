package edu;

public class Test01 {
	
	String name = "아아";
	int age = 10;
	
	public static void main(String[] args) {
		Test01 ta = new Test01();
		double r = ta.cal("360.7", 10);
		System.out.println("결과: " + r);
	}
	
	public double cal(String n, int b) {
		
		double result = 0;
		
		result = Double.parseDouble(n) * b;
		return result;
	}
	
	public void setNameAge(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public void hello() {
		System.out.println("안녕 " + this.name);
	}
	
	public void bye() {
		System.out.println("집에 가자" + this.age + "살");
	}
}

