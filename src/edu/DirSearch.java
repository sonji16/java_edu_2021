package edu;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;


public class DirSearch {
	String finalResult = "";
	public static void main(String[] args) {
		DirSearch dirSearch = new DirSearch();
		dirSearch.init();
		
	
		//Writer writer = new FileWriter("D:\\workspace_jiwoo\\data\\dir_result.txt");
		//writer.writer();
	}
	public void init() {
		start("D:/class", 0);
		System.out.println(finalResult);
		System.out.println("끝");
	}
	public void start(String root, int ct) {
		
		File file = new File(root);
		//get 얻고 배열 얻고 for 문 돌리고
		
		File[] arr = file.listFiles();
		if(arr != null) {
			for(File n : arr) {
				System.out.print(getTab(ct));
				if(n.isDirectory()) {
					
					finalResult = finalResult + "-"+ n;
					System.out.println(finalResult);
					start(n.getAbsolutePath(), ++ct);
				}else {
				
					finalResult = finalResult + "\t"+ n;
				}
			}
		}
		
	}
	public String getTab(int ct) {
		String result = "";
		for(int i = 0; i < ct; i++) {
			result += " ";
		}
		return result;
	}
	
	
}


