package ch07_01;

import java.util.Scanner;

class Child2 extends Parent{
	int x = 20;
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}


public class SuperTest2 {

	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}

}
