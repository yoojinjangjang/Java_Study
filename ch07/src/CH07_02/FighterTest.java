package CH07_02;

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if(f instanceof Unit2) {
			System.out.println("Unit �� �ڼ�");
		}
		if(f instanceof Fightable) {
			System.out.println("Fightable �� �ڼ�");
		}
		
		if(f instanceof Movable) {
			System.out.println("Movable �� �ڼ�");
		}
		
		if(f instanceof Attackable) {
			System.out.println("Attackable �� �ڼ�");
		}
		
		if(f instanceof Object) {
			System.out.println("Object �� �ڼ�");
		}
		
		
	}

}

class Unit2{
	int currentHP;
	int x;
	int y;
	
	public String toString() {
		return "Unit";
	}
	
}

interface Movable{
	void move(int x, int y);
}
interface Attackable{
	void attack(Unit u);
}
interface Fightable extends Movable,Attackable{}

class Fighter extends Unit2 implements Fightable{
	
	public void move(int x, int y) {
		System.out.println("move : " + x+ y);
	}
	public void attack(Unit u) {
		System.out.println("attack : " + u);
	}
}