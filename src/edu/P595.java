package edu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class P595 {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("D:\\workspace_jiwoo\\data\\test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();
		os.close();
		
	}
}
