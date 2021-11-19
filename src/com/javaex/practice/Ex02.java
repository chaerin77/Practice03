package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		
		int x, y;
		for(x=0; x<4; x++) {
			for(y=0; y<2; y++) {
				System.out.print("*"); 
				/* for안의for먼저 y부터따져봄 **
				                 x=0,줄바꿈한다음 x++ 해서 x->1될거라 예상하면
				                y를품고 x가한바퀴돌면 별두개가로로출력하고 줄바꿈한다는것
				                x는 총 4줄나올거니까 가세 2*4 별이 나올것  */
			}
			System.out.println("");
		}

	}

}
