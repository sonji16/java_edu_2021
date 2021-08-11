package edu;

import java.io.Serializable;

public class MyPass implements Serializable {
	String id = "";
	String name = "";
	String password = "";
	
	int age = 0;
	
	// 생성자, 생성시 멤버 변수 세팅
	public MyPass(String id, String name, String password, int age) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
	}
	
	public String is_adult() {
		String result = "성인입니다";
		
		if(this.age < 20) {
			result = "청소년입니다";
		
		}
		return result;
	}
	
	@Override
	public String toString() { 
		return "MyPass [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	//마우스우클릭--Source--generate toString



	//beans --마우스우클릭--Source--Generate Getters and Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
