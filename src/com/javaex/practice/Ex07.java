package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		//입력한 숫자의 값만큼 가로세로축에 숫자가입력된다
		int num = sc.nextInt();
		
		for(int y=1;y<=num;y++) {
			for(int x=1; x<=y; x++) { //여기 y를써야 2번째줄에 x2개찍기가 가능함
				System.out.print(y);//어렵게했다  2번재줄에num썼다가 y로바꾸고 print도 x하니까 12345나와서 y로함
			}
			System.out.println("");
		}	
		
		//1번째에 1개ㅑ 2번째에2개 3번째세로에 3개의별 세로줄
		
		
		
		
		sc.close();
	}

}
