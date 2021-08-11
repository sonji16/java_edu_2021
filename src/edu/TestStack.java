package edu;

public class TestStack {
	String[] q = new String[4];
	int idx = 0;
	
	public static void main(String[] args) {
		TestStack testStack = new TestStack();
		testStack.test();
	}
	
	public void test() {
	push("지우");
	push("유하");
	
	
	print();
	
	String name = pop();
	System.out.println(name + " 님 백신 맞으러 나감");
	
	print();
	
	name = pop();
	System.out.println(name + " 님 백신 맞으러 나감");
	
	print();
	
	
	
	push("보국");
	
	print();
	
	
	name = pop();
	System.out.println(name + " 님 백신 맞으러 나감");
	print();
	
	}
	
	//FIFO First Input First Output
	public void push(String name) {
		q[idx] = name;
		++idx;
	}
	
	public String pop() {
		String result = q[0];
		for(int i = 1; i < idx; i++) {
			q[i-1] = q[i];
		}
		--idx;
		q[idx] = null;
		
		return result;

		
	}
	
	public void print() {
		
		System.out.println("==================");
		for(int i = 0; i < q.length; i++) {
			System.out.println(i + " " + q[i]);
		}
		
	}
}
