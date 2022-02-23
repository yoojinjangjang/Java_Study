package CH07_02;

public class PolyArgumentTest {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Computer computer = new Computer();
		
		Buyer b = new Buyer();
		b.buy(tv);
		b.buy(computer);
		
		System.out.println("현재 남은 돈은 " + b.money + "입니다.");
		System.out.println("현재 보너스 점수는  "+ b.bonusPoint  + " 입니다.");
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
		super(100); //tv의 가격을 100만원, 보너스포인트는 10만원으로 한다.
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
	int money = 1000; //소유금액
	int bonusPoint = 0; //보너스 접ㅁ수
	Product[] items = new Product[10];
	int i = 0;
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		items[i++] = p;
		System.out.println(p+"을/를 구입하셨습니다.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i = 0;i<items.length;i++) {
			if(items[i] == null) break;
			sum += items[i].price;
			itemList += items[i] + ",";
		}
		
		System.out.println("총 구매 합계는 " + sum+ "만원 입니다. " ) ;
		System.out.println("총 구매 목록은 " + itemList + "입니다. " );
	}
}