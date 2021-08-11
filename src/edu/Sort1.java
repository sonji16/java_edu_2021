package edu;

public class Sort1 {
	int[] arr = { 9, 5, 4, 8, 1, 2, 7, 3, 6};
	
	public static void main(String[] args) {
		Sort1 sort1 = new Sort1();
		sort1.start();
	}
	
	public void start() {
		
		
		printArr(">>>정렬 전");
		bubble();
		printArr(">>>정렬 후");
		
	}
	public void bubble() {
		System.out.println(">>정렬 시작");
		
		for(int j = 0; j < arr.length-1; j++) {
			for(int i = 0; i < arr.length-1; i++) {
				if(arr[i]> arr[i+1]) {
					int a = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = a;
				
				}
			}
		}
			
	}
	
	public void printArr(String header) {
		System.out.println(header);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
