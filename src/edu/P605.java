package edu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class P605 {
	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("D:\\workspace_jiwoo\\data\\test2.txt");
		
		char[] array = {'A', 'B', 'C'};
		String name = "  Jiwoo Son";
		
		writer.write(array);
		writer.write(name);
		
		writer.flush();
		writer.close();
	}

}

/*
InputStream
InputStreamReader
Reader
BufferedReader ---data가 a b c ... 한개씩 들어올 때, [] = {a, b, c, ...}로 버퍼에 데이터를 넣어두었다가 abc.. 로 한번에 출력함

*/
