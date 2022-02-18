package ch06_1;

public class TvTest3 {
public static void main(String args[]) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel 값은 " + t1.channel);
		System.out.println("t2의 channel 값은 " + t2.channel);
		
		t2 = t1; //t1의 주소값을 t2에 저장한다.
		// t2와 t1은 같은 인스턴스를 가리키게 된다.
		
		t1.channel = 7;
		System.out.println("t1의 channel 값은 " + t1.channel);
		System.out.println("t2의 channel 값은 " + t2.channel);
	}
}


