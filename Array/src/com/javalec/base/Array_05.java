package com.javalec.base;

import java.util.Scanner;

public class Array_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 몇개의 숫자를 더할지 정하고 합계출력
//		int i, input, total = 0;
//		
//		System.out.print("몇개의 숫자를 더할까요? ");
//		int count = scanner.nextInt();
//		
//		System.out.println(count + "의 숫자를 입력하세요. ");
//		int[] num = new int [count];	//받은 숫자를 num 배열로 설정
//		
//		for (i = 0; i < num.length; i++) {
//			input = scanner.nextInt();
//			total += input;
//		}
//		System.out.println("입력한 숫자의 합은 " + total + "입니다.");
//-------------------------------------------------------------------------------------------------------
		
		// 몇개의 숫자를 입력할지 결정한 후 숫자를 입력하고 이 중 최대값의 위치와 최대값을 구하라.
		int count = 0;
		int max = 0;
		int value = 0;

		System.out.print("입력할 숫자의 갯수? (100개 미만) : ");
		count = scanner.nextInt();
		System.out.println(count + "개의 숫자를 입력하세요!");
		int[] input = new int[count];

		for (int i = 0; i < input.length; i++) {
			input[i] = scanner.nextInt();
			if (max < input[i]) {
				max = input[i];
				value = i;
			}
		}
		System.out.println("입력한 숫자중 최대값은 " + max + "이고 " + (value + 1) + "번째 값입니다.");
	}
}
//-------------------------------------------------------------------------------------------------------
