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
		// Singleton s = new Singleton(); �����ڰ� private�̹Ƿ� �ٸ� Ŭ�������� ������ �� ����. 
		Singleton s = Singleton.getInstance(); // �ν��Ͻ��� �����ϴ� �޼��带 ����Ѵ�. 
	}

}
