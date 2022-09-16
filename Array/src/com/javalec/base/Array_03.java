package com.javalec.base;

import java.util.Scanner;

public class Array_03 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int[] num = new int[5];
//		double tot = 0, avg = 0;
//		
//		for (int i = 0; i < num.length; i++) {
//			System.out.print((i + 1) + "번의 숫자를 입력하세요 : ");
//			 num[i]= scanner.nextInt();
//			 tot += num[i];
//			 avg = tot/num.length;
//		}
//		System.out.println("합계 : " + (int)tot + " \t" + "평균 : " + avg);
//	}
//
//}
		
//		배열을 이용하여 James, Cathy, Kenny, Martin, Crystal의 키(신장)를 입력받아 
//		평균값을 구하고 이들 중 가장 큰 학생의 이름과 키, 가장 작은 학생의 이름과 키를 구하라

		String[] names = {"James", "Cathy", "Kenny", "Martin", "Crystal","Kevin"};
		int[] height = new int [names.length];
		Scanner scanner = new Scanner(System.in);
		String tallest = null;
		String smallest = null;
		int tot = 0;
		double avg = 0;
		int max = 0;
		int min = 10000;

		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + "의 신장을 입력하세요!");
			height[i] = scanner.nextInt();
			tot += height[i];
			
			if (max < height[i]) {
				max = height[i];
				tallest = names[i];
			}
			if (min > height[i]) {
				min = height[i];
				smallest = names[i];
			}
		}
				
		avg = tot/names.length;
		System.out.println("평균 신장은 : " + avg);
		System.out.println("가장 큰 학생은 " + tallest + "이고 그 학생의 키는" + max);
		System.out.println("가장 큰 학생은 " + smallest + "이고 그 학생의 키는" + min);
	}
	
}
		
