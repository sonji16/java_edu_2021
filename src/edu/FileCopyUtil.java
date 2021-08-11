package edu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FileCopyUtil {
	public static void main (String[] args) {
		FileCopyUtil util = new FileCopyUtil();
		util.test();
	}
	
	public void makeFile(String src) {

		//Create a big file for the test
		
		try {
			FileOutputStream fos = new FileOutputStream(src);
			String data = "0123456789";
			for(int i  = 0; i < 13; i++) {
				data += data;
			}
			
			for(int i = 0; i < 100000; i++) {
				fos.write(data.getBytes());
			}
			
			
			fos.flush();
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void test() {
		String src = "D:\\workspace_jiwoo\\data/test_0.txt";
		
		
		
		//test copy 1
		String des1 = "D:\\workspace_jiwoo\\data/test_1.txt";
		copy_file_to_dir(src, des1);
		
		
		//test copy 2
		String des2 = "D:\\workspace_jiwoo\\data/test_2.txt";
		copy_file_to_dir_in_nio(src, des2);
		
	}
	public void copy_file_to_dir(String src, String des) {
		long stime = System.nanoTime();
		
		System.out.println(">> Start copy_file_to_dir");
		
		File srcFile = new File(src);
		File desFile = new File(des);
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(srcFile);
			fos = new FileOutputStream(desFile);
			
			int buff_len = 0;
			byte[] buff = new byte[1024];
			
			while((buff_len = fis.read(buff)) != -1) {
				fos.write(buff, 0, buff_len);
			
			}
		
		
			fos.close();
			fis.close();
			
		} catch(Exception ex1) {
			ex1.printStackTrace();
		}finally {
			
				try {
					if(fis != null) fis.close();
					if(fos != null) fis.close();

				} catch (IOException e) {
					fis = null;
					fos = null;
				}
			
		}
		long etime = System.nanoTime();
		System.out.println("Start: " + stime +"\n\r" + "End: " + etime +"\n\r" + "Time spent:" + (etime - stime));
		
		System.out.println(">> End copy_file_to_dir");
	}
	
	public void copy_file_to_dir_in_nio(String src, String des) {
		
		long stime = System.nanoTime();
		System.out.println(">> Start copy_file_to_dir_in_nio");
		
		File srcFile = new File(src);
		File desFile = new File(des);
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(srcFile);
			fos = new FileOutputStream(desFile);
			
			
			//Open a Channel
			FileChannel fic = fis.getChannel();
			FileChannel foc = fos.getChannel();
		
			
			foc.transferFrom(fic, 0, fic.size());
			
			fos.close();
			fis.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			
				try {
					if(fis != null)fis.close();
					if(fos != null) fos.close();
				} catch (IOException e) {
					fis = null;
					fos = null;
				}
			
		}
		long etime = System.nanoTime();
		System.out.println("Start: " + stime +"\n\r" + "End: " + etime +"\n\r" + "Time spent:" + (etime - stime));
		System.out.println(">> End copy_file_to_dir_in_nio");
	}
}
