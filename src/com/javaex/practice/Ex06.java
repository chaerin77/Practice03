package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		//1~100중에서 5의배수면서 7의배수인수 출력하기
		
		for(int i=1; i<=100; i++) {
			if(i%5==0 && i%7==0) {
				System.out.println(i);
			}
		}

	}

}
