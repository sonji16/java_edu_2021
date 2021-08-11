package edu;

public class P180 {
		public static void main(String[] args) {
			P180 p180 = new P180();
			p180.test();
		}
		
		void test() {
			int[] scores = {83, 90, 243, 67435};
			MyResult my_1 = cal(scores);
			my_1.print();
			
			int[] b = {32, 453, 6, 23, 45, 7};
			MyResult my_2 = cal(b);
			my_2.print();
		}
		
		public MyResult cal(int[] scores) {
			
			System.out.println("length : " + scores.length);
			
			for (int i = 0; i < scores.length; i++) {
			 
			}
			int sum = 0;
			for (int i = 0; i < scores.length; i++) {
				sum += scores[i];
			}
			
			double avg = (double) sum / scores.length;
			
			MyResult myResult = new MyResult(sum, avg);
			
			return myResult;
		}
}
class MyResult {
	int sum = 0;
	double avg = 0;
	
	MyResult(int a, double b) {
		this.sum = a;
		this.avg = b;
	}
	void print() {
		System.out.println("Sum : " + this.sum);
		System.out.println("Average : " + this.avg);	
	}
}