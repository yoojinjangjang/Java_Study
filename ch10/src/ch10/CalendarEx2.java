package ch10;

import java.util.Calendar;

public class CalendarEx2 {
	public static void main(String[] args) {
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		final String[] DAY_OF_WEEK = {"","월","화","수","목","금","토","일"};
		
		date1.set(2015,7,15);
		System.out.println("date1은  " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고 , "  );
		System.out.println("date2는 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+ "요일이다. ");
		
		
		// 두 날짜간의 차이
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		System.out.println("그 날(date1) 부터 지금 ( date2) 까지 " + difference + "초가 지났습니다.");
		System.out.println("일(day)로 계산하면 "  + difference/(24*60*60) + "일입니다." ); //1일 = 24*60*60
		
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+ "년" + (date.get(Calendar.MONTH)+1) + "월 " + date.get(Calendar.DATE) + "일 " ; 
	}
}
