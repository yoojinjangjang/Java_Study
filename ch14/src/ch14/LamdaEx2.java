package ch14;
@FunctionalInterface
interface MyFunction2{
	void myMethod();
}
public class LamdaEx2 {
	public static void main(String[] args) {
		MyFunction2 f = () -> {};
		Object obj = (MyFunction2)( ()->{} ); //Object타입으로 형변환 생략 
		String str = ( (Object)(MyFunction2)(()->{})).toString();
		
		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);
		
		
	}
}
