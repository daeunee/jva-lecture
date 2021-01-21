package com.yrdomain.ch11;

public class StringCharAtEx {

	public static void main(String[] args) {
		String ssn= "960210-2000000";
		char sex = ssn.charAt(7);
		switch(sex) {
		case '1' :
		case '3' :
			System.out.println("남자 입니당");
			break;
		case '2' :
		case '4' :
			System.out.println("여자 입니당");
			break;
		
		}

	}

}
