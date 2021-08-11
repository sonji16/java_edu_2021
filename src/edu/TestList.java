package edu;

import java.util.ArrayList;
import java.util.HashMap;

public class TestList {
	public static void main(String[] args) {
		TestList testList = new TestList();
		testList.testList();
	
	}
	
	//Key = value pair structure
	//카카오톡에서 사용자의 데이터를 찾기 위해 사용함
	//많은 데이터 중에서 한개를 찾는 가장 빠른 방법이다
	//key값은 하나만 존재함
	public void testHashmap() {
		HashMap<String, String> map_name = new HashMap<String, String>();
		map_name.put("1112", "지우");
		map_name.put("1112", "유하");
		map_name.put("1113", "보국");
		
		System.out.println(map_name.get("1114"));
	}
	
	//ArrayList는 자료 개수를 미리 정해놓지 않기 때문에 자료의 총 개수를 모를 때 유용함
	public void testList() {
		
			ArrayList<TestList> arr_name = new ArrayList<TestList>();
			arr_name.add("23445");
			arr_name.add("유하");
			arr_name.add("보국");
			arr_name.add("환");
			arr_name.add("유리");
			
			for(int i = 0; i < arr_name.size(); i++) {
				System.out.println(arr_name.get(i));
			}
			
			System.out.println("===================");
			
			//String처럼 클래스인 경우에만 사용 가능 -->요즘 트랜드
			//Object가 가장 원시적인 방법이기 때문에, Object를 쓰면 타입 상관없이 할 수 있긴 한데, 타입을 명시해주는 게 바람직함.
			for(Object n : arr_name) {
				System.out.println(n);
			}
			
	}
	
	//Array는 자료 개수를 미리 정해놔야 함. 그래서 한계가 있음
	public void testArray() {
		try {
			String[] arr_name = new String[3];
			arr_name[0] = "지우";
			arr_name[1] = "유하";
			arr_name[2] = "보국";
			arr_name[3] = "환";
			
			for(int i = 0; i < arr_name.length; i++) {
				System.out.println(arr_name[i]);
			}
			
			System.out.println("===================");
			
			//String처럼 클래스인 경우에만 사용 가능
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
