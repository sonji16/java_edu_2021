package edu;

public class Person {
	public static void main (String[] args) {
		Person m = new Person();
		m.today();
	}
	void today() {
		int food = 35000;
		int drink = 3240;
		int house = 1234234;
		
		//CalAI�� static�̶� new�� ���� ���ϰ� ��밡��
		int sum = CalAI.add(food, drink, house);
		System.out.println("sum:"+ sum);
		
		
		int result = CalAI.multi(food, drink, house);
		System.out.println("result: " + result);
		//������ 1���� �����ϵ��� static
		
		//class�� static class�� instance�� ��������
		/*
		 static class:
		 CalAI.add(1, 2);
		 
		 instance class:
		 CalAI c = new CalAI();
		 c.add(2, 3);
		 
		 
		 */
	}
}
