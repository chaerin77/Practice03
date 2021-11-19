package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		int x,y;
		for(x=0; x<4; x++) {
			for(y=2; y>=0; y--) {
				System.out.print("*"); 
			/*  y먼저보면 y2부터시작 y는0보다크거나같니? ㅇㅇ 그럼 *하나출력하고 y--로 y값1줄어듦
			 * 총 세번 출력하니까 *** 이렇게 붙어있는 상태 그리고 이상태로 이 괄호를 나가면
			 * x=0 이고 x가4보다 작니? ㅇㅇ 인 상태에서 줄을바꾸고 x=1이될거임
			 * y의 for를 품고있는 큰 for를 한바퀴 돌았을때 ***출력후 줄바꿈상태임
			 * 그리고 x는 총4번 반복될것임
			 * 가세 3*4의 별이 나올것이다 
			 	
			 */
			}
			System.out.println("");
		}

	}

}
