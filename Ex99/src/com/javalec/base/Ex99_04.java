package com.javalec.base;

import java.util.Scanner;

public class Ex99_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] histo = new int [10];
		
		System.out.println("Input Score : ");
		
		for (int i = 0; i < histo.length; i++) {
			System.out.print((i+1) + "의 Score : ");
			histo[scanner.nextInt()/10]++;
		}
		scanner.close();
		
		System.out.println("---------- Histogram ----------");
		
		for (int i = (histo.length-1); i>=0; i--) {
			System.out.print(String.format("&d", " : "));
			System.out.println();
		}
	}
}