package ch06;

public class FactorialTest {

	public static void main(String[] args) {
		int result = 0;
		
		result = factorial(4);
		System.out.println("result = " + result);
	}
	
	static int factorial(int n) {

		
		if(n==1) 
			return 1;
		
		return n*factorial(n-1);
	}

}
