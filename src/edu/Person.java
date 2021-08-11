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
		
		//CalAI는 static이라 new로 생성 안하고 사용가능
		int sum = CalAI.add(food, drink, house);
		System.out.println("sum:"+ sum);
		
		
		int result = CalAI.multi(food, drink, house);
		System.out.println("result: " + result);
		//유일한 1개만 존재하도록 static
		
		//class는 static class와 instance로 나누어짐
		/*
		 static class:
		 CalAI.add(1, 2);
		 
		 instance class:
		 CalAI c = new CalAI();
		 c.add(2, 3);
		 
		 
		 */
	}
}
