package CH07_02;

public class BindingTest2 {

	public static void main(String[] args) {
		Parent p = new Child2();
		Child2 c = new Child2();
		
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println("c.x = " + c.x);
		c.method();
		
		//childŬ�������� �ƹ��� ����� ���ǵǾ����� �ʱ� ������ �ܼ��� �������κ��� ������� ��ӹ޴´�. 
		// �ڼ� Ŭ���������� ����Ŭ������ ����� �ߺ����� ���Ǥ��� ������ ���������� Ÿ�Կ� ���� ��ȭ�� ����. ! 
		
		
	}

}

class Child2 extends Parent{
	
}
