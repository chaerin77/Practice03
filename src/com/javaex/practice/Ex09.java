package com.javaex.practice;

public class Ex09 {
	
	public static void main(String[] args) {
		
/*		for(int f=0; f<11 ;f++) {  이건뭔가 답이없어서 다시
			
			for(int num=f+1; num<=10; num++) {
				System.out.print(num);
			}
			System.out.println("");
		} */
		
		
/* 일단 10칸 10칸 출력되도록 짜는것 먼저 함		
		for(int y=1; y<=10; y++) {
			
			for(int x=1; x<=10; x++) {  //가로로10칸까지 쓰고나서 줄바꿈하는데 줄바꿔진다음엔 x의가로칸이 첫번째가로의 첫번째값+1인상태에서 10번째칸까지 1씩값이증가함
				System.out.print(x+"	");
			}
			System.out.println("");
		} */  		

		
		
		// 반복   ( 줄바꿈  첫번째항의 값이 1 증가됨    ( 첫번째항의 값 1씩 증가되어 가로로 출력 )    )  맨처음 첫번째항은1부터시작
		
		
		for(int y = 1; y<=10; y++) {
			
			for(int x=y; x<=9+y; x++) { 
				                          
				System.out.print(x+"	");
			}
			System.out.println("");
	
		} 

		
		} 
	}

