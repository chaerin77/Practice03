package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		
		int i=1;
		boolean flag = true;
		
		while(flag) {
			if(i>=5) {
				flag = false;
			}
			System.out.println(i); //false나와서 강종이니까 1+1=2 ?? 완전아
			i=i+1;
			
		}   //while(true)가 계속 반복한다는뜻같은데  if문에서 ..()안이 true여야 {}반복하는거 아닌가??
		

	}

}
