package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		int num = sc.nextInt();
		
		if(num%2==1) {
			
			int i=1;
			int oddsum=0;
			
			while(i<=num) {
				oddsum=oddsum+i;
				i=i+2;
			}
			System.out.println("결과값: " + oddsum);

			
		}else {
			
			int i=2;
			int evensum=0;
			
			while(i<=num) {
				evensum=evensum+i;
				i=i+2;
			}
			System.out.println("결과값: " + evensum);

			
		}
		
		
		sc.close();
	}

}
