package ch08;

public class ExceptionEx9 {

	public static void main(String[] args) {
		try {
			Exception e  = new Exception("고의 발생");
			throw e;
			// throw new Exception("고의 발생"); 한줄로 작성 가능 
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료");
	}

}
