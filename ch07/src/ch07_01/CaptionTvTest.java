package ch07_01;
class Tv{
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}
class CaptionTv extends Tv{
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}
public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv tv = new CaptionTv();
		tv.channel = 10;
		tv.channelUp();
		System.out.println(tv.channel);
		
		tv.displayCaption("Hello, world");
		tv.caption = true;
		tv.displayCaption("Hello, World");
	}

}
