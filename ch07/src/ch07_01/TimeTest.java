package ch07_01;
class Time{
	private int hour,minute,second;
	
	Time(int hour,int minute,int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() {return hour;}
	public void setHour(int hour) {
		if (hour < 0 || hour > 23 ) return;
		this.hour = hour;
	}
	
	public int getMinute() {return minute;}
	public void setMinute(int minute) {
		if(minute<0 || minute > 59) return;
		this.minute = minute;
	}
	
	public int getSecond() {return second;}
	public void setSecond(int second) {
		if(second <0 || second > 59)return;
		this.second = second;
	}
	
	public String toString() {
		return hour + " : " + minute + " : "  + second;
	}
	
	
}
public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time(12,35,30);
		System.out.println(t);
		//t.hour = 13 ; private 멤버변수이므로 다른 클래스에서는 접근이 불가하다. 
		t.setHour(t.getHour()+1); // 현재 시간보다 한시간 이후로 이동
		System.out.println(t);
		
	}	

}
