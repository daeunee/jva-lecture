package com.yrdomain.ch05;

public class ArrayLengthEx {
	public static void main(String[]args) {
		int[] scores = {83,90,87};//이거 쓸 줄 알아야함
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) { //배열의 크기를 구하는건 length다 ! 중요!
			sum+=scores[i];
		}		
		System.out.println("총합 :" + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 :" +avg);
	}

}
