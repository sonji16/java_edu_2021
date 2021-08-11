package edu;

public class MagicSquareSmall {
	
	public static void main(String[] args) {
		MagicSquareSmall magic = new MagicSquareSmall();
		magic.make(11);
	}
	
	public void make(int size) {
		int[][] arr_ma = new int[size][size];
	
		// 첫 시작 위치는 고정
		int x = (int)size / 2;
		int y = size - 1;
		
		// 첫 숫자 1은 고정 위치에 저장
		arr_ma[y][x] = 1;
		
		// 숫자 2부터 저장을 시작
		for(int i = 2; i < (size * size + 1); i++) {
			++x;
			++y;
			
			if(x >= size && y >= size) {
				x = x - 1;
				y = y - 2;
			}else if(x >= size) {
				x = 0;
			}else if(y >= size) {
				y = 0;
			}else if (arr_ma[y][x] > 0) {
				x = x - 1;
				y = y - 2;
			}
			arr_ma[y][x] = i;
		}
		print(arr_ma);	
	}
	
	public void print(int[][] arr_ma) {
		System.out.println(arr_ma.length + " " + arr_ma[0].length);
		System.out.println("\n");
		
		for(int i = 0; i < arr_ma.length; i++) {
			for(int j = 0; j < arr_ma[0].length; j++) {
				System.out.print(String.format("%5d", arr_ma[i][j]));
			}
			System.out.println();
		}
	}
}
