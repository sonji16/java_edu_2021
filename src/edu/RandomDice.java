package edu;

public class RandomDice {
	public static void main(String[] args) {
		RandomDice randomDice  = new RandomDice();
		randomDice.start();
	}
	public void start() {
		System.out.println("Start");
		
		for (int i = 0; i < 1; i++) {
			// 1~10 ���� �����ϰ� ���
			int ran = (int) (Math.random()*6 + 1);
			System.out.println(ran);
		
			if (ran == 1) {
				System.out.println("It is 1");
			} else if (ran < 3) {
				System.out.println("It is lesser than 3"); //ran <3 ��  ran <5 ���� �ڿ� ���� ran< 3�϶��� �ڵ尡 ����Ǵ� ��찡 �����Ƿ� �������� x.
			} else if (ran < 5) {
				System.out.println("It is lesser than 5");
			} else {
				System.out.println("It is 5 or 6");
			}
			
			switch(ran) {
			case 1: System.out.println("1�̴�"); break; //"break" should be placed respectively; else all the other case bellow will be printed.
			case 2: System.out.println("2�̴�"); break;
			case 3: System.out.println("3�̴�"); break;
			case 4: System.out.println("4�̴�"); break;
			case 5: System.out.println("5�̴�"); break;
			case 6: System.out.println("6�̴�"); break;
			default: System.out.println("It is default");
			}
		}
	}
}
