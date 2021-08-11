package edu;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Login {
	List<MyPass> list_member = new ArrayList<MyPass>();
	
	public static void main(String[] args) {
		Login login = new Login();
		login.makeMember();
		login.printMembers();
		
		login.login();
	}
	
	public void makeMember() {
		//Polymorphism
		MyPass p1 = new MyPass("id", "아기", "1111", 1);
		MyPass p2 = new MyPass("idid", "갓성인", "11121", 20);
		MyPass p3 = new MyPass("sonji16", "중딩", "1111", 16);
		MyPass p4 = new MyPass("idididid", "40대", "11141", 45);
		MyPass p5 = new MyPass("ididididid", "50대", "11151", 56);
		MyPass p6 = new AfricaMyPass("idx6", "Af10대", "11151", 10);
		MyPass p7 = new AfricaMyPass("idx7", "Af50대", "11151", 52);
		
		list_member.add(p1);
		list_member.add(p2);
		list_member.add(p3);
		list_member.add(p4);
		list_member.add(p5);
		list_member.add(p6);
		list_member.add(p7);
		
	}

	public void printMembers() {
		for (MyPass p : list_member) {
			System.out.println(p);
			System.out.println(p.is_adult());
		}
	}
	
	public void login() {
		boolean find = false;
		int failed_ct = 0;
		while(find == false) {
			String id= null;
			String pwd = null;
			
			System.out.println("아이디를 입력하세요");
			id = new Scanner(System.in).nextLine();
					
			System.out.println("비밀번호 입력하세요");
			pwd = new Scanner(System.in).nextLine();
			
			find = check(id, pwd);
			System.out.println("find: " + find);
			
			if(find == false) {
				++failed_ct;
				
				if(failed_ct > 5) {
					System.out.println("로그인 실패 횟수 5회");
					System.exit(-1);
				}
			}
			
		}
		System.out.println("Login check is finished");
	}
		
	public boolean check(String id, String password) {
		boolean find = false;
	//회원이면 파일로 MyPass 객체를 저장
		for(MyPass p : list_member) {
			if(id.equals(p.getId()) && password.equals(p.getPassword())) {
				System.out.println(">> 로그인 성공 회원입니다: " + id );
				find = true;
				
				//MyPass instance를 파일로 저장
				writeObject(p);
			}
		}
		return find;
	}
	
	public void writeObject(MyPass p) {
		String full_filename = "d:/20210724/summer/p.obj";
		try {
			FileOutputStream fos = new FileOutputStream(full_filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
			oos.flush();
			oos.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	} 
	
}
