package ch06_1;

public class TvTest3 {
public static void main(String args[]) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1�� channel ���� " + t1.channel);
		System.out.println("t2�� channel ���� " + t2.channel);
		
		t2 = t1; //t1�� �ּҰ��� t2�� �����Ѵ�.
		// t2�� t1�� ���� �ν��Ͻ��� ����Ű�� �ȴ�.
		
		t1.channel = 7;
		System.out.println("t1�� channel ���� " + t1.channel);
		System.out.println("t2�� channel ���� " + t2.channel);
	}
}


