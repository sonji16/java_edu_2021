package edu;

public class GreatestCommonFactor {
	public static void main (String[] args) {
		GreatestCommonFactor mcf = new GreatestCommonFactor();
		int a = 1;
		int b = 12;
		mcf.mcf(a, b);
		int result =mcf.mcf(a, b);
		System.out.println(a + "��" + b + "�� �ִ������� " + result);
	}
	
	public int mcf(int a, int b) {
		int result = 0;
		System.out.println("== mcf() ==");
		/*��Ŭ���� ȣ����
			a % b = 0 �̸� b�� �ִ����� b ! = 0
			tmp = a, a = b, b = a % b
		*/
		
		
		if (a % b == 0) {
			result = b;
	
		} else {
			while (b != 0) {
				int tmp = a;
				a = b;
				b = tmp % b;
				
			}
			result = a;
			
		}
		
		
		return result;
	}
	
}
