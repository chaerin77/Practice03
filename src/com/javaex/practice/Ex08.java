package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		//2~9단까지 출력할것 한단을 세로로출력후..어쩌고는 불가능한거같은데 가로줄로 단이1씩올라가지만 곱해지는수는일정함 근데그게 세로로1씩커짐
        //단의 변수를 dan이라 하고 곱해지는 수를 i라고 해보자 가로가9단까지 가면 줄바꿈
		
		
		for(int i=1; i<=9; i++) { //처음에 둘째줄에있는거랑 맨위꺼랑 바꿔썼었는데 생각해보니까 i가 dan보다 크게 도는애인것같아서 바꿈
			                      //가로로 코드가 쭉 붙어있다가 줄바꿈이 일어날건데 그럼 print 머시기와 줄바꿈이 반복으로 일어난단거고
			                      //가로로 붙는걸 보니 오른쪽에 곱해지는수인 i는 줄바꿈 전까지 변화가 없고
			                      //dan이 1씩 늘어나니까 걔네의반복이 9까지 끝난다음에야 i가 줄바꿈 후에 늘어나서 i가 더 큰개념의 반복이니까 더 바깥쪽에써줬다
			
			for(int dan=2; dan<=9; dan++) {
				
				System.out.print(dan+"*"+i+"="+dan*i+"\t");

			}
			
			System.out.println();
		}
		
	}

}
