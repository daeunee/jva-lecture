package com.yrdomain.test;

public class Login {
	public static void main (String[]args) {
		String[] user = {"daeunee", "0000"};  //0 1
		
		String Id = "daeunee";
		String Pw = "0000";
		
		// 판단 구문 id, pw
		if (Id == user[0] && Pw == user[1]) {
			System.out.println("로그인성공");
		} else {
			System.out.println("로그인실패");
		}
	}
}