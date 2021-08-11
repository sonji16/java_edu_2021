package edu;

public class P110 {
	int k = 10;
	
	public static void main(String[] args) {
		P110 my = new P110();
		//my.start();
		my.start3();
	}
	public void start() {
		System.out.println("Start");
		
		int a = 1;
		System.out.println(a);
		
		//a = a + 1;
		//a += 1;
		//++a;
		//a++;
		//int b = ++a;
		//System.out.println(b);
		
		int c = a++;
		System.out.println("c:" + c);
		System.out.println("a:" + a);

	}
	
	public void start2() {

	System.out.println("Start2");	
	
	//boolean is_boy = false;
	String name = "지우";
	boolean is_boy = (name =="지우"); //determining the boolean value of the previous name value
	if(name == "지우" == true) {
		System.out.println("남자다");
	}else {
		System.out.println("여자다");
	}
	}
	
	public void start3() {
		System.out.println("dd");
		int score =0;
		int no = 90;
		
		/*
		if (no < 80) {
			score = -100;
		}else {
			score = 100;
		}
		*/
		
		//삼항 연산자를 이용하여 위에 있는 코드를 한줄로 정리 가능
		score = (no < 80) ? -100 : 100;
		
		System.out.println(no + ">>" + score);
}
	
	}