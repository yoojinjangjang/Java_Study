package ch09;
class Point implements Cloneable{
	// Cloneable을 구현한 클래스만 clone()메서드를 호출할 수 있다.
	
	int x,y;
	
	Point(int x, int y ){
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "x : " + x + " y : " + y;
	}
	
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone(); // clone()반드시 예외 처리 
		}catch(CloneNotSupportedException e) {		}
		
		return obj;
	}
}
public class CloneEx1 {
	public static void main(String[] args) {
		Point original = new Point(3,5);
		Point copy = (Point)original.clone();
		System.out.println(original);
		System.out.println(copy);
	}
}
