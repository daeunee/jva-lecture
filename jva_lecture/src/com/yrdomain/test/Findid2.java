package com.yrdomain.test;
import java.util.Scanner;

//p.129~130

public class Findid2 {
    public static void main (String[]args) {
    	
    	
    	 // user 배열
        String[] user = {"daeunee","김다은", "daeunee@naver.com"}; 
        
        System.out.println("이름과 이메일을 입력하세용:");
        //스캐너 클래스를 생성
        Scanner sc = new Scanner(System.in);        
        // 스캐너를 사용해서 한 라인을 입력
        String name = sc.nextLine(); //nextLine()메소드호출 p.129            
        String email = sc.nextLine();                
        
     // user[1] 문자열과 email 문자열을 같은지 비교합니다. 같으면 true && user[2]문자열과 name 문자열을 비교
        if (user[1].equals(name) && user[2].equals(email)) {          
            System.out.println("아이디는" + user[0]+ "입니당");
            
        } else {
            System.out.println("아이디를 찾을 수 없습니다.");        // 위에 if문 false 일시 실행
        }
        sc.close();  //스캐너를 닫습니다. 
    }
}


    

















	
