package com.yrdomain.ch05;

public class ArrayLengthEx {
	public static void main(String[]args) {
		int[] scores = {83,90,87};//�̰� �� �� �˾ƾ���
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) { //�迭�� ũ�⸦ ���ϴ°� length�� ! �߿�!
			sum+=scores[i];
		}		
		System.out.println("���� :" + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("��� :" +avg);
	}

}
