package com.yrdomain.ch05;
public class StringEqualsEx {
	public static void main(String[]args) {
		String strVar1 = "�����";
		String strVar2 = "�����"; //������� ����ִ� �޸� �ּҸ� ��

		if(strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		}else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
	}
	if(strVar1.equals(strVar2)) { // ������ �� ���� ��(�̰Ը��̾���)
		System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
	}
			String strVar3 = new String("�����");//�ʱⰪ ������� �༭��ü�� ����°���.
			String strVar4 = new String("�����");
			
			if(strVar3 == strVar4) {
				System.out.println("strVar3�� strVar4�� ������ ����");
			} else {
				System.out.println("strVar3�� strVar4�� ������ �ٸ�");
			}
				if(strVar3.equals(strVar4)) {
					System.out.println("strVar3�� strVar4�� ���ڿ��� ����");
				}
			}
			
	
	}


