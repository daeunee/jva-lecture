package com.yrdomain.test;
import java.util.Scanner;

//p.129~130

public class Findid2 {
    public static void main (String[]args) {
    	
    	
    	 // user �迭
        String[] user = {"daeunee","�����", "daeunee@naver.com"}; 
        
        System.out.println("�̸��� �̸����� �Է��ϼ���:");
        //��ĳ�� Ŭ������ ����
        Scanner sc = new Scanner(System.in);        
        // ��ĳ�ʸ� ����ؼ� �� ������ �Է�
        String name = sc.nextLine(); //nextLine()�޼ҵ�ȣ�� p.129            
        String email = sc.nextLine();                
        
     // user[1] ���ڿ��� email ���ڿ��� ������ ���մϴ�. ������ true && user[2]���ڿ��� name ���ڿ��� ��
        if (user[1].equals(name) && user[2].equals(email)) {          
            System.out.println("���̵��" + user[0]+ "�Դϴ�");
            
        } else {
            System.out.println("���̵� ã�� �� �����ϴ�.");        // ���� if�� false �Ͻ� ����
        }
        sc.close();  //��ĳ�ʸ� �ݽ��ϴ�. 
    }
}


    

















	
