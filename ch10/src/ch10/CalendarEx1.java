package ch10;

import java.util.Calendar;

public class CalendarEx1 {
	public static void main(String args[]) {
		Calendar today = Calendar.getInstance(); //�⺻������ ���� ��¥�� �ð����� ����
		
		System.out.println("�� ���� �⵵ : " + today.get(Calendar.YEAR));
		System.out.println("��(0~11, 0: 1��) : " + today.get(Calendar.MONTH));
		System.out.println("�� ���� �� ° �� : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("�� ���� �� ° �� : " + today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("�� ���� ���� : " + today.get(Calendar.DATE));
	}
}
