package edu;

public class Test01 {
	
	String name = "�ƾ�";
	int age = 10;
	
	public static void main(String[] args) {
		Test01 ta = new Test01();
		double r = ta.cal("360.7", 10);
		System.out.println("���: " + r);
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
		System.out.println("�ȳ� " + this.name);
	}
	
	public void bye() {
		System.out.println("���� ����" + this.age + "��");
	}
}

