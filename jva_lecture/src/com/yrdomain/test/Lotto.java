package com.yrdomain.test;

public class Lotto {

	public static void main(String[] args) {
		
		//로또 번호가 저장 될 배열선언
		int []lotto = new int[6];//int형배열을 만든다. 변수명이 로또. 칸이 6개
		
	    //ex)5명 수학성적
		int [] scores = new int[5];
		
		int scores [0] =
	    int scores [1]=
	    
	    String names = new int[5];
		String names = {" 김다은,김다은,김다은,김다은,김다은"}
		//슬랙 하단 5명 이름으로 구성 된 배열을 선언하고
		String slack = new String[5];
		String [1] = " d";
		String [2]=" d";
		//6번 순환한다는뜻
		for (int i=0; i<6; i++) {
			
			
		};
		
		for (int i=0; i<45; i++)
	
		//d인덱스 2에 33입력
		lotto[2] = 33;
		
		//배열에 값 넣으려면 인덱스 꼭 넣어야함
		for(int i=0; i<lotto.length; i++) {
			//배열에 값 넣으려면 인덱스 꼭 넣어야함
			lotto[i]=(int)(Math.random()*45)+1; //1부터 의미 , 로또번호는 45개임
			//1<=(int넣어서 정수로변환)1,2,3,4,5,~<46
			
			//캐스팅이라는 용어를 쓰고 강제로 형변환을 합니다. 
			//Byte에서 int로 갈때 작은단위에서 큰단위로 감.
			//이럴때는 자동으로 형변환하는데
			//int에서 byte로 가는건 자동으로 안되니 강제로 해주는거예요
			
			
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
				
				}
			}
			
			
			
		}
		
		//체크하기위해 순번 돌리는거임.
		
		// 그 배열에 번호 입력(for문 필수)
		
		// 배열내용 출력(for문)
		
		//1. 목적이 1-45까지 랜덤추출
		//2. 랜덤추출함수의 원래 범위는 0<함수<1
		//3. 함수의 범위가 실수형인데 로또번호는 정수여야함
		//4. 함수의범위를 캐스팅을 이용해서 정수형으로 바꿔줌
		//5. 범위가 0~1(정수가 됐지만 이상태로는
		//0이상1미만인 정수0만 나옴)
		//그래서 양변에 45를 곱함
		//그럼 0-45의 범위가 나옴
		//6. 이대로 끝내면 랜덤추출로 0이 나오고
		//44까지만 나옴
		//7. 그래서 양변에 +1을 함
		//8. 이제야 정수1-45까지 랜덤추출가능해짐

	}

}
