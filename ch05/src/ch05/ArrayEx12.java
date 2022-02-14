package ch05;

public class ArrayEx12 {

	public static void main(String[] args) {
		String[] name = {"Kim","Park","Yi"};
		
		
		for(int i =0 ;i<name.length;i++) {
			System.out.printf("name[%d]: %s%n",i,name[i]);
		}
		
		String tmp = name[2];
		System.out.println(tmp);
		name[0] ="Tu";
		
		for(String str : name) {
			System.out.println(str);
		}
	}

}
