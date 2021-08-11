package edu;

public class SelectSort {
	
	public static void main(String[] args) {
		//c, c++ --> pointer ������
		SelectSort sort = new SelectSort();
		sort.start();
	}
	
	//Ctrl + F11
	public void start() {
		System.out.println("start...");
		
		int[] arr_src = {9, 1, 6, 8, 4, 3, 2, 0};
		
		select_sort(arr_src);
	}
	
	//selectSort --> Carmel ǥ���
	//select_sort --> shift x �� ���� ��
	
	
	public void select_sort(int[] arr) {
		print_array("���� ��", arr);
		
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
				
		//��ġ�� ���� ���� ��ġ�� ���� swap
		//min ���� ���� ��, min_idx ��ġ ����  arr[i] = arr[min_idx]		
		
			if(min_idx > -1) {
				int tmp = arr[i];
				arr[i] = arr[min_idx];
				arr[min_idx] = tmp;
			}
			
			print_array(i + "����", arr);
			
		}
		print_array("���� ��", arr);
	}
		
	public void print_array(String head, int[] arr) {
		System.out.println(head);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
