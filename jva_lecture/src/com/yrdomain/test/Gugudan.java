package com.yrdomain.test;

public class Gugudan {

	public static void main(String[] args) {
		Gugudan flex = new Gugudan();
		int a= 3;
		int b= 7;
		flex.dan(a,b);
	}
	    public void dan(int c, int d)	{
		for (int i=1; i<10; i++) { //�� �ݺ�
			System.out.println(c+ " * " +i+" = "+(c*i));//���
		}
			for(int j=1; j<10; j++) { 
				System.out.print(d+" * "+j+" = "+d*j); //���
				System.out.println('\t');
			}
	
		}

	}


