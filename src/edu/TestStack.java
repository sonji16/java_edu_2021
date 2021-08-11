package edu;

public class TestStack {
	String[] q = new String[4];
	int idx = 0;
	
	public static void main(String[] args) {
		TestStack testStack = new TestStack();
		testStack.test();
	}
	
	public void test() {
	push("����");
	push("����");
	
	
	print();
	
	String name = pop();
	System.out.println(name + " �� ��� ������ ����");
	
	print();
	
	name = pop();
	System.out.println(name + " �� ��� ������ ����");
	
	print();
	
	
	
	push("����");
	
	print();
	
	
	name = pop();
	System.out.println(name + " �� ��� ������ ����");
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
