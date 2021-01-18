package com.yrdomain.ch05;

public class ArrayCopyByForEx {
	public static void main (String [] args) {
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5]; //이게 젤중요
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];//뉴에다가 올드어레이를 넣으래요
		}
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i]+",");
		}
		
		
		
	}
	

}
