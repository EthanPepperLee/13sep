package com.javalec.base;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int row = 0;
		int column = 0;
		int count = 1;

		System.out.print("몇 단계의 피라미드로 구성할까? : ");
		row = scanner.nextInt(); // 5단 입력

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < i + 1; j++) {

				System.out.print(count + " ");
				count++;
			}

			System.out.println();
		}
	}
}
