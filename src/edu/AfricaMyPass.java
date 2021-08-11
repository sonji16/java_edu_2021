package edu;

public class AfricaMyPass extends MyPass{

	public AfricaMyPass(String id, String name, String password, int age) {
		super(id, name, password, age); //super == 부모(MyPass)로 던져줌
	}

	@Override
	public String is_adult() {
		String result = "아프리카 성인입니다";
				
		if(this.age < 10) {
			result = "청소년입니다";
		
		}
		return result;
	}
	
	
	
}
