package com.javalec.base;

import java.util.Calendar;

public class Calendar_01 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();	//현재의 년월일시분초 가져오기
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int min = calendar.get(Calendar.MINUTE);
		int sec = calendar.get(Calendar.SECOND);
		
		
		System.out.println(year + "." + month + "." + day);
		System.out.println(week[(calendar.get(Calendar.DAY_OF_WEEK))-1]);
		System.out.println(hour + ":" + min + ":" + sec);
		

		

	}

}
