package com.yrdomain.DadunsTest;

public class Ex03_4 {  //for��  �̿��ؼ� 1���� 100������ ���� �� 3�ǹ�� ���� ���ϱ�

	public static void main(String[] args) {
		int sum =0;
		
		
		for(int i=1; i<=100; i++) {
		
		if(i%3==0) {
			sum+=i;
			
		}

		System.out.println("3�ǹ���� ��:" +sum );
	}

}
}