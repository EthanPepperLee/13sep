package com.javalec.base;

import java.util.Scanner;

public class Ex99 {

	public static void main(String[] args) {
//		사용자에게 시작값과 끝값을 입력받아 합계 구하기
//		시작값을 입력하세요 : 1
//		끝값을 입력하세요 : 10
//		합계는 55입니다.
//		홀수의 합계는 25입니다.
//		짝수의 합계는 30입니다.
//		합계의 평균은 5.5입니다.
//		홀수의 합계 평균은 ___입니다.
//		짝수의 합계 평균은 ___입니다.

//		-------------------------------------------------------------

//		선언부
		Scanner scanner = new Scanner(System.in);
		int num1 = 0; // 시작값
		int num2 = 0; // 끝
		int num3 = 0;
		int sum = 0; // 합계
		int oddSum = 0; // 홀수의 합
		int evenSum = 0; // 짝수의 합
		double avg = 0.0; // 평균
		int odd = 0; // 홀수의 갯수
		int even = 0; // 짝수의 갯
		double oddAvg = 0; // 홀수의 합계 평균
		double evenAvg = 0; // 짝수의 합계 평균
//		-------------------------------------------------------------

//		입력부
		System.out.print("시작값을 입력하세요 : ");
		num1 = scanner.nextInt();
		System.out.print("끝값을 입력하세요 : ");
		num2 = scanner.nextInt();
//		-------------------------------------------------------------
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				sum += i;
				if (i % 2 == 0) {
					evenSum += i;
					even += 1;
				} else {
					oddSum += i;
					odd += 1;
				}
			}
		} else {
			num3 = num1; num1 = num2; num2 = num3;
			for (int i = num1; i <= num2; i++) {
				sum += i;
				if (i % 2 == 0) {
					evenSum += i;
					even += 1;
				} else {
					oddSum += i;
					odd += 1;
				}
			}
		}

		avg = (double) sum / (num2 - num1 + 1);
		oddAvg = (double) oddSum / odd;
		evenAvg = (double) evenSum / even;
//		-------------------------------------------------------------
		System.out.println("합계는 " + sum + "입니다.");
		System.out.println("홀수의 합계는 " + oddSum + "입니다.");
		System.out.println("짝수의 합계는 " + evenSum + "입니다.");
		System.out.println("합계의 평균은 " + avg + "입니다.");
		System.out.println("홀수의 개수는 " + odd + "입니다.");
		System.out.println("짝수의 개수는 " + even + "입니다.");
		System.out.println("홀수의 합계의 평균은 " + oddAvg + "입니다.");
		System.out.println("짝수의 합계의 평균은 " + evenAvg + "입니다.");
	}
}