package ch08;

public class ExceptionEx9 {

	public static void main(String[] args) {
		try {
			Exception e  = new Exception("���� �߻�");
			throw e;
			// throw new Exception("���� �߻�"); ���ٷ� �ۼ� ���� 
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ���� ����");
	}

}
