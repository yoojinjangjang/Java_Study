package CH07_02;

public class BindingTest2 {

	public static void main(String[] args) {
		Parent p = new Child2();
		Child2 c = new Child2();
		
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println("c.x = " + c.x);
		c.method();
		
		//child클래스에는 아무런 멤버도 정의되어있지 않기 때문에 단순히 조상으로부터 멤버들을 상속받는다. 
		// 자손 클래스에서는 조상클래스의 멤버를 중복으로 정의ㅎ지 않으면 참조변수의 타입에 따른 변화가 없다. ! 
		
		
	}

}

class Child2 extends Parent{
	
}
