package com.javalec.base;

public class Array_02 {
	
	public static void main(String[] args) {
		
		int[] intNum = {5,3,9};
		int i = 0, j;
		
		for (i = 1; i<=9; i++) { //곱해지는 수
			for (j = 0; j <= intNum.length; j++) {
				j = intNum[j];
				System.out.print(j + " X " + i + " = " + i*j + "\t");
				System.out.println();
			}
		}
	}
}