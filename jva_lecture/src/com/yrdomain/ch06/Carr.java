package com.yrdomain.ch06;

public class Carr {
	//�ʵ�
	
	int speed; 
	
	//������
	
	//�޼ҵ�
	int getSpeed(){
		return speed;
		
	}
  
	   void KeyTurnOn() {
		   System.out.println("Ű�� �����ϴ�.");
	   }
	   
	   void run() {
		   for(int i=10; i<=50; i+=10) {
			   speed=i;
			   System.out.println("�ü�:"+speed+"km/h");
			   
			   
		   }
		   
		   
	   }
}

