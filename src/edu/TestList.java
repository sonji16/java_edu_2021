package edu;

import java.util.ArrayList;
import java.util.HashMap;

public class TestList {
	public static void main(String[] args) {
		TestList testList = new TestList();
		testList.testList();
	
	}
	
	//Key = value pair structure
	//īī���忡�� ������� �����͸� ã�� ���� �����
	//���� ������ �߿��� �Ѱ��� ã�� ���� ���� ����̴�
	//key���� �ϳ��� ������
	public void testHashmap() {
		HashMap<String, String> map_name = new HashMap<String, String>();
		map_name.put("1112", "����");
		map_name.put("1112", "����");
		map_name.put("1113", "����");
		
		System.out.println(map_name.get("1114"));
	}
	
	//ArrayList�� �ڷ� ������ �̸� ���س��� �ʱ� ������ �ڷ��� �� ������ �� �� ������
	public void testList() {
		
			ArrayList<TestList> arr_name = new ArrayList<TestList>();
			arr_name.add("23445");
			arr_name.add("����");
			arr_name.add("����");
			arr_name.add("ȯ");
			arr_name.add("����");
			
			for(int i = 0; i < arr_name.size(); i++) {
				System.out.println(arr_name.get(i));
			}
			
			System.out.println("===================");
			
			//Stringó�� Ŭ������ ��쿡�� ��� ���� -->���� Ʈ����
			//Object�� ���� �������� ����̱� ������, Object�� ���� Ÿ�� ������� �� �� �ֱ� �ѵ�, Ÿ���� ������ִ� �� �ٶ�����.
			for(Object n : arr_name) {
				System.out.println(n);
			}
			
	}
	
	//Array�� �ڷ� ������ �̸� ���س��� ��. �׷��� �Ѱ谡 ����
	public void testArray() {
		try {
			String[] arr_name = new String[3];
			arr_name[0] = "����";
			arr_name[1] = "����";
			arr_name[2] = "����";
			arr_name[3] = "ȯ";
			
			for(int i = 0; i < arr_name.length; i++) {
				System.out.println(arr_name[i]);
			}
			
			System.out.println("===================");
			
			//Stringó�� Ŭ������ ��쿡�� ��� ����
			for(String n : arr_name) {
				System.out.println(n);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("There is an error in the program");
		}
		System.out.println("The End");
	}
}
