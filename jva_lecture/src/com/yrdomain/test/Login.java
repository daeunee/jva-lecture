package com.yrdomain.test;

public class Login {
	public static void main (String[]args) {
		String[] user = {"daeunee", "0000"};  //0 1
		
		String Id = "daeunee";
		String Pw = "0000";
		
		// �Ǵ� ���� id, pw
		if (Id == user[0] && Pw == user[1]) {
			System.out.println("�α��μ���");
		} else {
			System.out.println("�α��ν���");
		}
	}
}