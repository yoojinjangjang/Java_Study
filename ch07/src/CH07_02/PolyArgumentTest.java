package CH07_02;

public class PolyArgumentTest {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Computer computer = new Computer();
		
		Buyer b = new Buyer();
		b.buy(tv);
		b.buy(computer);
		
		System.out.println("���� ���� ���� " + b.money + "�Դϴ�.");
		System.out.println("���� ���ʽ� ������  "+ b.bonusPoint  + " �Դϴ�.");
	}

}

class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0); 
	}
	Product(){
		price = 0;
		bonusPoint = 0;
	}
}
class Tv extends Product{
	
	Tv(){
		super(100); //tv�� ������ 100����, ���ʽ�����Ʈ�� 10�������� �Ѵ�.
	}
	
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product{
	
	Computer(){
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Buyer{
	int money = 1000; //�����ݾ�
	int bonusPoint = 0; //���ʽ� ������
	Product[] items = new Product[10];
	int i = 0;
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		items[i++] = p;
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i = 0;i<items.length;i++) {
			if(items[i] == null) break;
			sum += items[i].price;
			itemList += items[i] + ",";
		}
		
		System.out.println("�� ���� �հ�� " + sum+ "���� �Դϴ�. " ) ;
		System.out.println("�� ���� ����� " + itemList + "�Դϴ�. " );
	}
}