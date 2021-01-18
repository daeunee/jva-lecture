package com.yrdomain.test;

public class Lotto2 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		for (int i=0; i<6; i++) {
			lotto[i]= (int)(Math.random()*45)+1;
			
		}
		System.out.println(lotto[3]);
	}

}
