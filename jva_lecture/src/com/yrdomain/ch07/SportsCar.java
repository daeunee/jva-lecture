package com.yrdomain.ch07;

public class SportsCar {
	@Override
	public void speedUp() { speed+=10; }
	
	// �������̵��� �� �� ����
	@Override
	public void stop() {
		System.out.println("������ī�� ����");
		speed = 0;
	}
}

