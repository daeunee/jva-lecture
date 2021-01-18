package com.yrdomain.ch06;

public class Carr {
	//필드
	
	int speed; 
	
	//생성자
	
	//메소드
	int getSpeed(){
		return speed;
		
	}
  
	   void KeyTurnOn() {
		   System.out.println("키를 돌립니다.");
	   }
	   
	   void run() {
		   for(int i=10; i<=50; i+=10) {
			   speed=i;
			   System.out.println("시속:"+speed+"km/h");
			   
			   
		   }
		   
		   
	   }
}

