package com.javalec.base;

import java.util.Scanner;

public class Main_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int result = 0;

		System.out.print("Enter an integer (0~9) : ");
		int input = scanner.nextInt();

		while (input > 0) {
			result = input % 10;
			input = input / 10;
			sum += result;
			if (input < 0) {
				break;
			}
		}
		System.out.println("Sum of digits = " + sum);
	}

}
