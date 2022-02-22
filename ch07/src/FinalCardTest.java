
class Card{
	final int NUMBER;
	final String KIND;
	
	Card(String kind,int number){
		this.NUMBER = number;
		this.KIND = kind;
	}
	
	Card(){
		this("HEART",1);
	}
	
	public String toString() {
		return KIND + ", " + NUMBER;
	}
}


public class FinalCardTest {

	public static void main(String[] args) {
		Card c = new Card("HEART",10);
		
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		
		System.out.println(c);
	}

}
