package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		int multi = 1;  //곱하기라서 초기화 값 1
		
		for(int i =1; i<=num; i++) { //앞에서 sum=sum+num 했던거랑 비슷한거
		      multi = multi*i;
		}
		
		System.out.println("결과값: " + multi);
		
		sc.close();
	}

}
