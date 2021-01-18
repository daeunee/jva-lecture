package com.yrdomain.test;

public class FindId3 {
	public static void main (String[]args) {
	String[] user ={"daeunee", "daeunee@naver.com","김다은"};
	
	String email = "daeunee@naver.com";
	String name = "김다은" ;
	
	

	
	if(email==user[1]&&name==user[2]) {
		System.out.println("아이디는"+user[0]+"입니다");
	}else {
		System.out.println("아이디를 찾을 수 없습니다.");
		
	}
	
	
		
	}
	 
}
	
