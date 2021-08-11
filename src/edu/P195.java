package edu;

public class P195 {
	public static void main (String[] args) {
	P195 aa = new P195();
	aa.q5();
	}
	
	public void test() {
		System.out.println("Start the test");
		int[] a = {1, 2, 3};
		int[] b = {4, 5, 6};
		//a = b;
		
		//simplest method to replace
		for (int i = 0; i < a.length; i++) {
			a[i] = b[i];
		}
		System.out.println("a: " + a[0]);
		System.out.println("b: " + b[0]);
		
		b[0] = 99; //새로 0번째 값 할당
		System.out.println("b2:"+ b[0]);
		//a[0]을 출력하면 어떤 값이 찍힐까
		System.out.println("a2:"+ a[0]);
	}

	public void test1() {
		System.out.println("test1()");
		
		int[][] arr_box = new int[5][5];
		System.out.println("arr_box.length: " + arr_box.length);
		System.out.println("arr_box.length: " + arr_box[0].length);
		
		arr_box[0][3] = 4;
		arr_box[4][4] = 99;
		for (int i = 0; i < arr_box.length; i++) {
			for (int j = 0; j < arr_box[0].length; j++) {
				String data = String.format("%3d", arr_box[i][j]);
				
				System.out.print(data);
			}
			System.out.println();
		}
	}

	public void q1() {
		System.out.println("q1");
		String [][] arr = new String[7][7];
		//값 입력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
			arr[i][j] = "0";	
			}
				
		}
			
			
		//print
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				String data = String.format("%5s", arr[i][j]);
				System.out.print(data);
				
			}
			System.out.println();
			
		}
	}

	public void q2() {
		System.out.println("q2");
		String [][] arr = new String[7][7];
		
		//값 입력
		int num = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
			
			arr[i][j] = String.valueOf(num);
			num ++;
			}
				
		}
			
			
		//print
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				String data = String.format("%5s", arr[i][j]);
				System.out.print(data);
				
			}
			System.out.println();
			
		}
	}

	public void q3() {
		System.out.println("q3");
		String [][] arr = new String[5][5];
		
		//값 입력
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = "";
			}
			arr[i][i] = String.valueOf(1);
			
			int col = arr[0].length - 1;
			if (arr[i][col-i] == "") {
				arr[i][col-i] = String.valueOf(2);
			}
			
			
		}
		
	
	
		
	
			
			
		//print
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				String data = String.format("%3s", arr[i][j]);
				System.out.print(data);
				
			}
			System.out.println();
			
		}
	}

	public void q4() {
		System.out.println("q4");
		String [][] arr = new String[9][9];
		
		//값 입력
		int num = 1;
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = "";
				if (i % 2 == 0) {
					if (j % 2 == 0) {
						arr[i][j] = String.valueOf(num);
						num += 1;
					}
				}
				
				else {
					if (j % 2 != 0) {
						arr[i][j] = String.valueOf(num);
						num += 1;
					}
				
				}
				
			}
			
		}
		
	
	
		
	
			
			
		//print
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				String data = String.format("%3s", arr[i][j]);
				System.out.print(data);
				
			}
			System.out.println();
			
		}
	}

	public void q5() {
		int [][] arr_value = {
				 {0,3}
				,{1,2}
				,{1,4}
		};
		
		String[][] arr1 = new String[7][7];
		
		for (int i=0; i < arr1.length; i++) {
			for (int j=0; j < arr1.length; j++) {
				arr1[i][j] = "1";
			}
		}
		
		//print
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[0].length; j++) {
				String data = String.format("%2s", arr1[i][j]);
				System.out.print(data);
				
			}
			System.out.println();
			
		}
	}
}

