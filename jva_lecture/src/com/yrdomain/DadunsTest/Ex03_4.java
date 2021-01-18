package com.yrdomain.DadunsTest;

public class Ex03_4 {  //for문  이용해서 1부터 100까지의 정수 중 3의배수 총합 구하기

	public static void main(String[] args) {
		int sum =0;
		
		
		for(int i=1; i<=100; i++) {
		
		if(i%3==0) {
			sum+=i;
			
		}

		System.out.println("3의배수의 합:" +sum );
	}

}
}