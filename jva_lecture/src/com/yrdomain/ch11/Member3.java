package com.yrdomain.ch11;

public class Member3 implements Cloneable {

	public String name;
	public int age;
	public int[] scores; 
	public Car car;  
	
	public Member3(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 먼저 얕은 복사를 해서 name, age를 복제한다.
		Member3 cloned = (Member3) super.clone(); 
		//scores를 깊은 복제한다.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length); // clone()메소드 재정의
		// car를 깊은 복제한다.
		cloned.car = new Car(this.car.model);
		
		return cloned;
	}
	
	public Member3 getMember() {
		Member3 cloned = null;
		try {
			cloned = (Member3) clone(); // 재정의된 clone() 메서드 호출
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return cloned;
	}
}
