package edu;

public class EngApp implements AppDev{
	String name = "";
	
	public EngApp(String name) {
		this.name = name;
	}
	
	
	public void hi() {
		System.out.println(this.name + "Hi!");
	}
	
	
	@Override
	public void study() {
		System.out.println(this.name + " Studying English");
		
	}

	@Override
	public void level5() {
		System.out.println(" English level 5");
		
	}

}
