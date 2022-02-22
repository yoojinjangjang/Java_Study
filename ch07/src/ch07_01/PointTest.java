package ch07_01;
class Point2{
	int x, y;
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x: " + x + " y: " + y;
		
	}
}

class Point3D extends Point2{
	int z;
	
	Point3D(int x, int y, int z){
		// 여기서 super(); 가 수행된다. -- 조상클래스의 기본생성자가 호출된다. 기본생성자가 존재하지 않아서 에러 발생 
		super(x,y);
		this.z = z;
	}
	
	String getLocation() {
		return super.getLocation() + " z: "  + z;
	}
}
public class PointTest {

	public static void main(String[] args) {
		Point3D p  = new Point3D(1,2,3);
		System.out.println(p.getLocation());
	}

}
