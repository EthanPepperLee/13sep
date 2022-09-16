package com.javalec.base;

public class Break {

	public static void main(String[] args) {
//		1에서 100까지 출력중 10을 만나면 Find라는 글자를 출력하고 종료하기
		for(int i = 0; i < 100; i++) {
			if(i % 10 == 0) {
//				System.out.println("Find");
//				break;
				continue;
			}
			System.out.println(i);
		}
	}
}
