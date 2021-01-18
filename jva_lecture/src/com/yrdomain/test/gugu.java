package com.yrdomain.test;


	public class gugu {

	    public static void main(String[] args) {

	        int[][] gugu = new int[8][9];

	        for (int i = 0; i < gugu.length; ++i) {
	            int frontN = 2;
	            int rearN = 1;
	            for (int j = 0; j < gugu[i].length; ++j) {
	                gugu[i][j] = (i + frontN) * (j + rearN);
	            }
	        }

	        for (int i = 0; i < gugu.length; ++i) {
	            System.out.println(i+2 +"´Ü\n");
	            for (int j = 0; j < gugu[i].length; ++j) {
	                System.out.println((i+2) + " x " + (j+1) + " = " + gugu[i][j]);
	            }
	            System.out.println("");
	        }
	    }
	}

}
