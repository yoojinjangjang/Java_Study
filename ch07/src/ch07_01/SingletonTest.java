package ch07_01;
final class Singleton{
	private static Singleton s = new Singleton();
	
	private Singleton() {
		//...
	}
	
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
		}
		return s;
	}
}
public class SingletonTest {

	public static void main(String[] args) {
		// Singleton s = new Singleton(); 생성자가 private이므로 다른 클래스에서 접근할 수 없다. 
		Singleton s = Singleton.getInstance(); // 인스턴스를 생성하는 메서드를 사용한다. 
	}

}
