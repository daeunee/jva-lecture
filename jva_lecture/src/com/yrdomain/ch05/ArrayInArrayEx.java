package com.yrdomain.ch05;
//대체적으루 이렇게 많이 쓴다는뎅.. 잘 알아두기
public class ArrayInArrayEx {
	public static void main(String[] args) {
	
	int[][] mathScores = new int[2][3];//배열은 몇개가 돼도 상관x //배열이 2개있다라는건 행이2개라는뜻//2,3은자리수임 두칸세칸
	
	for(int i=0; i<mathScores.length; i++) 	{
		for (int k=0; k<mathScores[i].length; k++){
			System.out.println("mathScores["+i+"]["+k+"]="
					+mathScores[i][k]);
		}
		}
	System.out.println();
	
	int[][] englishScores = new int[2][];
	englishScores[0] = new int[2];
	englishScores[1] = new int[3];
	for(int i=0; i<englishScores.length;i++) {
		for(int k=0; k<englishScores[i].length;k++) {
			System.out.println("englishScores["+i+"]["+k+"]="
					+englishScores[i][k]);
		}
	}
	
			System.out.println();
			
			int[][]javaScores = {{95,80},{92,96,80}};
			for(int i =0; i<javaScores.length; i++) {
				for(int k=0; k<javaScores[i].length; k++) {
					System.out.println("javaScores["+i+"]["+k+"]="
							+javaScores[i][k]);
					
					
					
				}
				
			}
			
			
			
		}
		

	}	



