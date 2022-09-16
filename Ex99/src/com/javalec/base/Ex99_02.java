package com.javalec.base;

import java.util.Scanner;

public class Ex99_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;	//몇개의 숫자를 입력했는지
		//귀하가 입력하신 숫자는 1 2 3 4 이고 합계는 _이고 평균은 _입니다.
		//그 중 홀수의 갯수는 _이고 짝수의 갯수는 _ 입니다.
		
		System.out.print("몇개의 숫자를 입력하겠습니까? ");
		count = scanner.nextInt();
		int[] num = new int[count];	//입력받은 숫자 배열
		
		for (int i = num[0]+1; i <= num.length; i++) {
			System.out.print(i + "번째 숫자를 입력하세요 : ");
		}
			for (int j = 0; j <= num.length; j++) {
				j = scanner.nextInt();
				
			
		}
	}
}
