package ch06;

public class ReturnTest {

	public static void main(String[] args) {
		ReturnTest r = new ReturnTest();
		int result1 = r.add(3, 5);
		System.out.println("result1 : "  + result1);
		
		int[] result2 = {0};
		r.add(3, 5,result2);
		System.out.println("result2 : " + result2[0]);
	}
	
	int add(int a, int b ) {
		return a+b;
	}
	void add(int a, int b , int[] result) {
		result[0] = a+ b;
	}

}
