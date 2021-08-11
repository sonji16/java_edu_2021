package edu;

public class RandomDice {
	public static void main(String[] args) {
		RandomDice randomDice  = new RandomDice();
		randomDice.start();
	}
	public void start() {
		System.out.println("Start");
		
		for (int i = 0; i < 1; i++) {
			// 1~10 까지 랜덤하게 출력
			int ran = (int) (Math.random()*6 + 1);
			System.out.println(ran);
		
			if (ran == 1) {
				System.out.println("It is 1");
			} else if (ran < 3) {
				System.out.println("It is lesser than 3"); //ran <3 을  ran <5 보다 뒤에 쓰면 ran< 3일때의 코드가 실행되는 경우가 없으므로 논리적으로 x.
			} else if (ran < 5) {
				System.out.println("It is lesser than 5");
			} else {
				System.out.println("It is 5 or 6");
			}
			
			switch(ran) {
			case 1: System.out.println("1이다"); break; //"break" should be placed respectively; else all the other case bellow will be printed.
			case 2: System.out.println("2이다"); break;
			case 3: System.out.println("3이다"); break;
			case 4: System.out.println("4이다"); break;
			case 5: System.out.println("5이다"); break;
			case 6: System.out.println("6이다"); break;
			default: System.out.println("It is default");
			}
		}
	}
}
