package com.javalec.base;

import java.util.Scanner;

public class Ex99_05 {

	public static void main(String[] args) {
//		학생수가 4명이고 과목이 3과목일 경우의 점수 합계와 평균 구하기 기능 추가
//		Korean의 성적을 입력 : 
//		English의 성적을 입력 : 
//		Mathematics의 성적을 입력 : 
//		No 의 성적은 : 
		// "Korean" + "\t" + "English" + "\t" + "Mathematics" + "\t" + "Total" + "\t" +
		// "Average"
		Scanner scanner = new Scanner(System.in);

		String[] subject = { "Korean", "English", "Mathematics" }; // 과목의 배열
		int[][] stuScore = new int[4][subject.length]; // 학생, 점수 배열
		// stuScore.length = 4
		// stuScore[x].length = 3
		int i, j, k;

		for (i = 0; i < subject.length; i++) {
			System.out.println(subject[i] + "의 성적을 입력 : "); // 과목 성적 입력
			for (j = 0; j < stuScore.length; j++) {
				System.out.print("No" + (j + 1) + "의 성적은 : "); // no j의 과목 i 성적
				for (k = 0; k < subject.length; k++) {
					stuScore[j][k] = scanner.nextInt();
				}
				//00 01 02
				//10 11 12
				//20 21 22
			}

		}
//		System.out.println("\t" + subject[0] + "\t\t" + subject[1] + "\t\t" + subject[2]);
//		for (int l = 0; l < stuScore.length; l++) {
//			for (k = 0; k < subject.length; k++) {
//				System.out.print(stuScore + "\t");
//				
//			}
//			
//		}
//
//	}
		
		
//		for (int i = 0; i < subject.length; i++) {
//		}
	}
}
