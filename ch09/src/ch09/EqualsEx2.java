package ch09;
class Person{
	long id;
	
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person)obj;
			return p.id == this.id;
		}else
			return false;
		}
	
	Person(long id){
		this.id = id;
	}
}
public class EqualsEx2 {
	public static void main(String[] args) {
		Person p1 = new Person(801108111222L);
		Person p2 = new Person(801108111222L);
		
		if(p1==p2) 
			System.out.println("p1�� p2�� ��������Դϴ�.");
		else 
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�");
		
		if(p1.equals(p2))
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		else
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
	}
}
