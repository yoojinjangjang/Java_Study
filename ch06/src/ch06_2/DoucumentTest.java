package ch06_2;

class Document{
	static int  count = 0;
	String name;
	
	Document(){
		count++;
		System.out.println("�������"+count);
		
	}
	
	Document(String name){
		this.name = name;
		System.out.println("���� " + this.name + "�� �����Ǿ����ϴ�.");
	}
}
public class DoucumentTest {

	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("�ڹ�.txt");
		Document d3 = new Document();
		Document d4 = new Document();

	}

}
