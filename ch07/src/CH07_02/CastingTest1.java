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
		
		car = fe; // upCasting - 형변환 생략 가능, car의 멤버만 사용 가능 , 멤버개수 줄어듬
		// car.water(); 에러 발생 - FireEngine 의 메서드 사용 불가 
		fe2 = (FireEngine)car; //downCasting - 형변환 생략 불가, fe2의 멤버 사용가능, 멤버개수 증가
		fe2.water(); // FireEngine 메서드 사용가능
		
	}

}
