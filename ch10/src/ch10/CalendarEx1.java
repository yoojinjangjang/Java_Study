package ch10;

import java.util.Calendar;

public class CalendarEx1 {
	public static void main(String args[]) {
		Calendar today = Calendar.getInstance(); //기본적으로 현재 날짜와 시간으로 설정
		
		System.out.println("이 해의 년도 : " + today.get(Calendar.YEAR));
		System.out.println("월(0~11, 0: 1월) : " + today.get(Calendar.MONTH));
		System.out.println("이 해의 몇 째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇 째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("이 달의 몇일 : " + today.get(Calendar.DATE));
	}
}
