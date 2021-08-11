package edu;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Car {
	
	public static void main(String[] args) {
		String name = Car.class.getName();
		System.out.println(name);
		
		//여기서 Field[] 는 타입임
		Field[] arr_field = Car.class.getFields();
		
		for(Field f : arr_field) {
			System.out.println(f.getName());
		}
		System.out.println("------------------");
		Method[] arr_method = Car.class.getMethods();
		for(Method m : arr_method) {
			System.out.println(m.getName());
		}
		}
	
	public String color = "";
	public String name = "";
	public String company = "";
	
	public int price = 0;
	public int width = 0;
	public int height = 0;
	
	boolean is_sale = false;
	
	public Car() {}
	public Car(String name, int price) {}
	public Car(String name, String company, int price) {}
	
	public boolean getSale() {
		return is_sale;
	}
	
	public String fullName() {
		return this.name + " " + company;
	}
	
	public int price() {
		return price;
	}
}
