package CH07_02;
class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrr~");
	}
	
	void stop() {
		System.out.println("stop!!");
	}
	
	
}

class FireEngine extends Car{
	void water() {
		System.out.println("water!!!");
	}
}
public class CastingTest1 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		car = fe; // upCasting - ����ȯ ���� ����, car�� ����� ��� ���� , ������� �پ��
		// car.water(); ���� �߻� - FireEngine �� �޼��� ��� �Ұ� 
		fe2 = (FireEngine)car; //downCasting - ����ȯ ���� �Ұ�, fe2�� ��� ��밡��, ������� ����
		fe2.water(); // FireEngine �޼��� ��밡��
		
	}

}
