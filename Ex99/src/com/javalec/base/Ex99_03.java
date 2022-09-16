package com.javalec.base;

public class Ex99_03 {

	public static void main(String[] args) {
		
		int result = 1;	//첫번째 결과 (고정값)
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("10 ^ " + i + " = \t");
			System.out.printf("%12d%n", result);
			result = result * 10;
		}
	}
}
