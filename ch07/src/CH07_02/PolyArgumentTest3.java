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
	int money = 1000; //소유금액
	int bonusPoint = 0; //보너스 접ㅁ수
	Vector items = new Vector();
	int i = 0;
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		items.add(p);
		System.out.println(p+"을/를 구입하셨습니다.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		if(items.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}

		for(int i = 0;i<items.size();i++) {
			Product p = (Product)items.get(i);
			sum+=p.price;
			itemList += p + ",";
		}
		
		System.out.println("총 구매 합계는 " + sum+ "만원 입니다. " ) ;
		System.out.println("총 구매 목록은 " + itemList + "입니다. " );
	}
	
	void refund(Product p) {
		if(items.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		}
		else {
			System.out.println("구입하신 제품 중에 해당 제품이 없습니다."); 
		}
	}
}