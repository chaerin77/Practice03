package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		
		for(int y=0; y<num; y++) {
		
			for(int x=0; x<num-y; x++) {
				
				System.out.print("*");
				
			}
			//y=0이고 x가 0일때 x의for문을 다 돌고나면 x++해서 x=1이되고 y가 한줄띄운다음 y=1이된다
			System.out.println();
		}
		
		
		
		
		
	}

}
