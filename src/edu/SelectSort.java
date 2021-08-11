package edu;

public class SelectSort {
	
	public static void main(String[] args) {
		//c, c++ --> pointer 강력함
		SelectSort sort = new SelectSort();
		sort.start();
	}
	
	//Ctrl + F11
	public void start() {
		System.out.println("start...");
		
		int[] arr_src = {9, 1, 6, 8, 4, 3, 2, 0};
		
		select_sort(arr_src);
	}
	
	//selectSort --> Carmel 표기법
	//select_sort --> shift x 라서 많이 씀
	
	
	public void select_sort(int[] arr) {
		print_array("정렬 전", arr);
		
		//arr index arr[0], arr[1]
		
		for(int i = 0; i < arr.length; i++) {
			
			//finding the smallest value
			int min = 999999; //default value
			int min_idx = i;
			for(int j = i; j < arr.length; j++) {
				if(arr[j] < min) {
					min = arr[j];
					min_idx = j;
				}
			}
				
		//위치와 작은 값의 위치를 서로 swap
		//min 가장 작은 값, min_idx 위치 정보  arr[i] = arr[min_idx]		
		
			if(min_idx > -1) {
				int tmp = arr[i];
				arr[i] = arr[min_idx];
				arr[min_idx] = tmp;
			}
			
			print_array(i + "정렬", arr);
			
		}
		print_array("정렬 후", arr);
	}
		
	public void print_array(String head, int[] arr) {
		System.out.println(head);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
