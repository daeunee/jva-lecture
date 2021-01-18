package com.yrdomain.ch05;
public class StringEqualsEx {
	public static void main(String[]args) {
		String strVar1 = "김다은";
		String strVar2 = "김다은"; //김다은이 담겨있는 메모리 주소를 비교

		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
	}
	if(strVar1.equals(strVar2)) { // 실제로 들어간 값을 비교(이게많이쓰여)
		System.out.println("strVar1과 strVar2는 문자열이 같음");
	}
			String strVar3 = new String("김다은");//초기값 김다은을 줘서객체를 만드는것임.
			String strVar4 = new String("김다은");
			
			if(strVar3 == strVar4) {
				System.out.println("strVar3과 strVar4는 참조가 같음");
			} else {
				System.out.println("strVar3과 strVar4는 참조가 다름");
			}
				if(strVar3.equals(strVar4)) {
					System.out.println("strVar3과 strVar4는 문자열이 같음");
				}
			}
			
	
	}


