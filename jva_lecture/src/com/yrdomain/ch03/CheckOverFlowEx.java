package com.yrdomain.ch03;

public class CheckOverFlowEx {
	public static void main(String [] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		}	catch(ArithmeticException e) {
			
			System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����");
		}
	
	}

	private static int safeAdd(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	  
	  



	
	

}
