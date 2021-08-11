package edu;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class P618 {
	/*
	 * read, write
	 * 어느 디렉토리에?
	 */
	public static void main(String[] args) throws Exception {
		P618 p618 = new P618();
		p618.test_read();
	}
	
	public void test_read() throws Exception {
		String full_filename = "d:/20210724/summer/gugudan.txt";
		String result = read(full_filename);
		System.out.println("result: " + result);
	}
	
	public void make_gugudan() throws Exception {
		String full_filename = "d:/20210724/summer/gugudan.txt";
		String data = "=구구단 시작=\n";
		
		//make a gugudan and save it as data
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				String txt_result = i + "x" + j + "=" + i*j;
				data = data + txt_result + "\n";
			}
		}
		write(full_filename, data, false);
		
	}
	
	public void start() throws Exception {
		String fullfilename = "d:/20210724/summer/jiwoo.txt";
		//parsing
		System.out.println(fullfilename.lastIndexOf("/"));
		int idx = fullfilename.lastIndexOf("/");
		String dirname = fullfilename.substring(0, idx);
		String filename = fullfilename.substring(idx + 1, fullfilename.length());
		System.out.println("dirname: " + dirname);
		System.out.println("filename: " + filename);
		
		// 1. make directory & file
		checkDir(dirname, true);
		
		// 2. write in the file
		String result = read(fullfilename);
		System.out.println("read result: "+ result);
		
		// 3. read the file and print
		write(fullfilename, "안녕하세요", false);
		write(fullfilename, "중복됩니다", true);
		write(fullfilename, "1", true);
		write(fullfilename, "2", true);
		write(fullfilename, "3", true);
		
		
		
		/*
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
		*/
	}
	
	public boolean checkDir(String filename, boolean want_make) {
		boolean result = false;
		
		File file = new File(filename);
		boolean is_exists = file.exists();
		//If you want to make it if it doesn't exist
		System.out.println(is_exists + "   filename: " + filename);
		if(is_exists == false && want_make ==true) {
			file.mkdirs(); //한꺼번에 추적해서 만듦
			is_exists = file.exists();
			System.out.println("없어서 만들었어요:  " + is_exists);
		}
		System.out.println(is_exists + "   filename: " + filename);
		
		return result;
	}

	public void write(String fullfilename, String data, boolean is_append) throws Exception {
		FileOutputStream fos = new FileOutputStream(fullfilename);
		Writer writer = new OutputStreamWriter(fos);
		if(is_append == true) {
			writer.append(data); //append the text -->not working b/c the file is closed and reopened
		} else {
			writer.write(data); //write from the beginning of the file
		}
		
		writer.flush();
		writer.close();
	}
	
	
	private String read(String fullfilename) throws Exception {
		File file = new File(fullfilename);
		if(file.exists() == true) {
			FileInputStream fis = new FileInputStream(fullfilename);
			BufferedInputStream bis = new BufferedInputStream(fis); //physically helps the program and increase speed
			Reader reader = new InputStreamReader(bis);
			char[] buffer = new char[100]; // 실제로 긴 파일을 열려면 버퍼를 100보다 크게 잡거나 버퍼를 여러번 돌려야 함
			int readCharNum = 0;
			
			String data = "";
			while(readCharNum > -1) {
				readCharNum = reader.read(buffer);
				System.out.println("readCharNum: " + readCharNum);
				
				if(readCharNum > -1) {
					data += new String(buffer, 0, readCharNum);
				}
				
			}
			reader.close();
			
			return data;
		} else {
			return null;
		}
	}
}

