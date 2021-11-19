package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
				
		for(int i=1; i<=5; i++) {
			
			System.out.print("숫자: ");
			int num = sc.nextInt();
			
		}
	/*	if()
		
		System.out.println("최대값은 "+ Max + "입니다.");
		
		sc.close();  */
		
	}

}


//5개를 입력받는다 5개중에 가장 큰것을 골라낸다 출력한다   입력받는횟수를 i라할까
//하나하나쓰고 저렇게비교하니까 당장 num2랑 num3중에 3이 더크면 최댓값을 못 골라내네 그럼 여기는 무한정의 무언가에서 입력받은값중 젤큰거 골라라 이런건가
//근데 젤큰걸 어케골라??