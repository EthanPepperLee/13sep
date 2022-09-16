package com.javalec.base;

public class While {

	public static void main(String[] args) {
//1부터 100까지 합
		int i = 0, tot = 0;
		while(true) {
			tot += i;
			i++;
			if (i > 100) {
				break;//반복문에서 빠져나옴
			}
		}
		System.out.println(tot);
	}
}
