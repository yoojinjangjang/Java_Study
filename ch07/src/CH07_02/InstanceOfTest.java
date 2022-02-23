package CH07_02;


public class InstanceOfTest {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("This is insatnceof FireEngine");
		}
		if(fe instanceof Car) {
			System.out.println("This is insatceof Car");
		}
		if(fe instanceof Object) {
			System.out.println("This is instanceof Object");
		}
		
		System.out.println(fe.getClass().getName());
		
		Car car = new Car();
		if( car instanceof FireEngine) {
			System.out.println("test");
		}
	}

}
