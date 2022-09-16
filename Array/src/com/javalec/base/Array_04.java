package com.javalec.base;

import java.util.Scanner;

public class Array_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
//		구구단+4단까지
//		int[] num = {1,2,3,4,5,6,7,8,9}; //곱해지는 수
//		int i, j;
//		int input;
//
//		System.out.print("Input your number : ");
//		input = scanner.nextInt();
//
//		for (i = 0; i<num.length; i++) {	
//			if (input+3>9) {
//				break;
//			} else {
//				System.out.print(input + " X " + num[i] + " = " + input*num[i]+ "\t");
//				System.out.print(input+1 + " X " + num[i] + " = " + (input+1)*num[i] + "\t");
//				System.out.print(input+2 + " X " + num[i] + " = " + (input+2)*num[i] + "\t");
//				System.out.print(input+3 + " X " + num[i] + " = " + (input+3)*num[i] + "\t");
//				System.out.println("");
//			}
//		}
//	}
//}
//-------------------------------------------------------------------------------------------------------

//		String Format
//		int num = 8;
//		double dNum = 12.34567;
//		String str = "abcdefg";
//		System.out.println("AAA : " + String.format("%3d", num));
//		System.out.println("AAA : " + String.format("%5.2f", dNum));
//		System.out.println("CCC : " + String.format("%10s", str));
//-------------------------------------------------------------------------------------------------------

		//팩토리얼 구하기
		int i;
		int decimal = 0;
		int value = 1;
		
		System.out.print("Input your decimal no. : ");
		decimal = scanner.nextInt();
		int[] factor = new int[decimal];
		
		for (i = factor.length; i > 0; i--) {
			value = value * i;
		}
		System.out.println(decimal + "'s factorial value : " + value);
	}
}

