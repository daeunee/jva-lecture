package com.yrdomain.ch11;

public class MemberEx2 {

	public static void main(String[] args) {
		//원본 객체 생성
Member2 original = new Member2("blue", "홍길동", "12345", 25, true);
		
		
		Member2 cloned = original.getMember();
		cloned.password = "67890";    // 복제 객체에서 패스워드 변경
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id: " + cloned.id);
		System.out.println("name: " + cloned.name);
		System.out.println("password: " + cloned.password);
		System.out.println("age: " + cloned.age);
		System.out.println("adult: " + cloned.adult);

		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id: " + original.id);
		System.out.println("name: " + original.name);
		System.out.println("password: " + original.password); 
		System.out.println("age: " + original.age);
		System.out.println("adult: " + original.adult);
	}
}
