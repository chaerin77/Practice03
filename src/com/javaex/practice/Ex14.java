package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i<=num; i++) {
			
			sum=sum+i;
		}
		
		String plus = "+";
		for(int i=1; i<=num; i++) {
			
			if(i==num) {
				System.out.println(i);
				break;
			}
			System.out.print(i+plus);
			
			
		}
		System.out.println("합계: " + sum);
		
		sc.close();
	}

}
