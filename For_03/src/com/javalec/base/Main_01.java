package com.javalec.base;

public class Main_01 {

	public static void main(String[] args) {
		int i, j;
		
		for (i = 1; i <= 9; i++) {
			for (j = 2; j <= 9; j++) {
				if ((i % 2 == 0) || (j % 2 == 0)) {
					System.out.print(j + " X " + i + " = " + j * i + "\t");
				} else {
					System.out.print("\t\t");
				}
			}
			System.out.println();
		}
	}
}
