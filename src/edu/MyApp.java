package edu;

public class MyApp implements AppDev{
	String name = "";
	
	
	public MyApp(String name) {
		this.name = name;
	}
	
	@Override
	public void study() {
		 System.out.println(this.name + " studying programming");
		
	}

	@Override
	public void level5() {
		System.out.println(" programming level 5");
		
	}
}
