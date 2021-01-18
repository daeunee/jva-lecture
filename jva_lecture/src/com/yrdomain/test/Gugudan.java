package com.yrdomain.test;

public class Gugudan {

	public static void main(String[] args) {
		Gugudan flex = new Gugudan();
		int a= 3;
		int b= 7;
		flex.dan(a,b);
	}
	    public void dan(int c, int d)	{
		for (int i=1; i<10; i++) { //단 반복
			System.out.println(c+ " * " +i+" = "+(c*i));//출력
		}
			for(int j=1; j<10; j++) { 
				System.out.print(d+" * "+j+" = "+d*j); //출력
				System.out.println('\t');
			}
	
		}

	}


