package CH07_02;

import java.util.Vector;

public class PolyArgumentTest3 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		
		b.refund(com);
		b.summary();
		
	}

}
class Buyer2{
	int money = 1000; //�����ݾ�
	int bonusPoint = 0; //���ʽ� ������
	Vector items = new Vector();
	int i = 0;
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		items.add(p);
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		if(items.isEmpty()) {
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}

		for(int i = 0;i<items.size();i++) {
			Product p = (Product)items.get(i);
			sum+=p.price;
			itemList += p + ",";
		}
		
		System.out.println("�� ���� �հ�� " + sum+ "���� �Դϴ�. " ) ;
		System.out.println("�� ���� ����� " + itemList + "�Դϴ�. " );
	}
	
	void refund(Product p) {
		if(items.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "��/�� ��ǰ�ϼ̽��ϴ�.");
		}
		else {
			System.out.println("�����Ͻ� ��ǰ �߿� �ش� ��ǰ�� �����ϴ�."); 
		}
	}
}