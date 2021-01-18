package com.yrdomain.ch03;

public class CheckOverFlowEx {
	public static void main(String [] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		}	catch(ArithmeticException e) {
			
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		}
	
	}

	private static int safeAdd(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	  
	  



	
	

}
