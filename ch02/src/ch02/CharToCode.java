package ch02;

public class CharToCode {

	public static void main(String[] args) {
		
		char ch = 'A'; 
		int code = (int)ch;
		
		System.out.printf("%c=%d(%#X)%n",ch,code,code);
		
		char hch = '��';
		System.out.printf("%c=%d(%#X)%n",hch,(int)hch,(int)hch);
		
		System.out.println('5'+5);
	}

}
