package edu;

public class TestApp {

	public static void main(String[] args) {
		TestApp app = new TestApp();
		app.init();

	}
	
	public void init() {
		//create MyApp, EngApp instances and call them
		
		AppDev[] arr_dev = new AppDev[5];
		arr_dev[0] = new MyApp("Python");
		arr_dev[1] = new MyApp("Java");
		arr_dev[2] = new MyApp("C++");
		
		arr_dev[3] = new EngApp("a ");
		arr_dev[4] = new EngApp("b ");
		
		for(int i = 0; i < arr_dev.length; i++) {
			arr_dev[i].study();
			
			if(arr_dev[i] instanceof EngApp) {
				
				EngApp k = (EngApp)arr_dev[i];
				k.hi();
				//(  (EngApp)arr_dev[i]  ).hi();
			}
		}
		
	}

}
