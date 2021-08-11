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
BufferedReader ---data�� a b c ... �Ѱ��� ���� ��, [] = {a, b, c, ...}�� ���ۿ� �����͸� �־�ξ��ٰ� abc.. �� �ѹ��� �����

*/
