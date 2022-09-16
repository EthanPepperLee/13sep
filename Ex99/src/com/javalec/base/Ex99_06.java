package com.javalec.base;

import java.util.Scanner;

public class Ex99_06 {

	public static void main(String[] args) {
		//입력할 숫자의 갯수를 정하고 숫자 검색
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int search = 0;
		int inputNum = 0;
		boolean ok = false;

		System.out.print("입력할 숫자의 갯수? : ");
		inputNum = scanner.nextInt();
		int[] array = new int[inputNum];
		System.out.println(inputNum + "개의 숫자를 입력하세요! : ");

		for (int i = 0; i < inputNum; i++) {
			System.out.print((i + 1) + "의 숫자 : ");
			num = scanner.nextInt();
			array[i] = num;
		}

		System.out.print("검색할 숫자는? : ");
		search = scanner.nextInt();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == search) {
				System.out.println(search + "의 위치는 " + (i + 1) + "번째입니다.");
				ok = true;	//ok에 true값이 새로 대입되고 아래 if문은 실행안됨
				break;
			}
		}
		if (ok == false) {
			System.out.println(search + "는 존재하지 않습니다.");
		}

	}
}
