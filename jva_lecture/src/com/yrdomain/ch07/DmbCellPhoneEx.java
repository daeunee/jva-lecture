package com.yrdomain.ch07;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("������", "���", 11);
		
		System.out.println("��: " + dmbCellPhone.model);
		System.out.println("����: " + dmbCellPhone.color);
		// DmbCellPhone �ʵ�
		System.out.println("ä��: " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ������ε���");
		dmbCellPhone.sendVoice("���� �ݰ����ϴ�.");
		dmbCellPhone.hangUp();

		// DmbCellPhone �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}