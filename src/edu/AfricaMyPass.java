package edu;

public class AfricaMyPass extends MyPass{

	public AfricaMyPass(String id, String name, String password, int age) {
		super(id, name, password, age); //super == �θ�(MyPass)�� ������
	}

	@Override
	public String is_adult() {
		String result = "������ī �����Դϴ�";
				
		if(this.age < 10) {
			result = "û�ҳ��Դϴ�";
		
		}
		return result;
	}
	
	
	
}
