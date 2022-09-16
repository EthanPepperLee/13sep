//package com.javalec.base;
//
//public class Array_01 {
//	
//	public static void main(String[] args) {
////		배열(Array)
////		문자열 7개를 넣을 수 있는 배열 공간 만들기
////		String str = "aaa";
////		String str1 = new String("aaa");
//		String[] str = new String[7];
//
//		/*
//		 * str[0] = "일요일"; str[1] = "월요일"; str[2] = "화요일"; str[3] = "수요일"; str[4] =
//		 * "목요일"; str[5] = "금요일"; str[6] = "토요일";
//		 * 
//		 * for(int i = 0; i < str.length; i++) { System.out.println(str[i]); }
//		 * System.out.println(str.length);
//		 */
//
////		배열의 초기값을 넣고 작업하기
//
//		int[] intNum = { 1, 5, 8, 12, 200, 1002 };
//		double tot = 0, avg = 0;
//
////		배열에 데이터 확인!
////		for (int i = 0; i < intNum.length; i++) {
////			System.out.println(intNum[i]);
////		}
//
////		배열의 평균 구하기
//		for (int i = 0; i < intNum.length; i++) {
//			tot += intNum[i];
//		}
//		avg = tot / intNum.length;
//		System.out.println("합계 : " + tot);
//		System.out.println("평균 : " + avg);
//	}
//}

		//배열에 해당하는 구구단 출력하기
package com.javalec.base;

public class Array_01 {
	
	public static void main(String[] args) {
		
		int[] intNum = {5,3,9};
		int i=0, j=0;
		
		for (j = 1; j <= 9 ; j++) {
			j = intNum[j];
			for (i = 0; i < intNum.length; i++) {
				System.out.print(i + " X " + j + " = " + j * i + "\t");
			}
		}
	}
}
		
