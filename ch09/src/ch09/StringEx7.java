package ch09;

public class StringEx7 {
	public static void main(String args[]) {
		String fullName = "Hello.java";
		
		int index = fullName.indexOf(".");
		
		String fileName = fullName.substring(0,index); //처음부터 '.'이 있는 곳까지의 문자열을 추출
		
		String ext = fullName.substring(index+1);  // '.'부터 끝까지의 문자열을 추출
		
		System.out.println(fullName + "의 확장자를 제외한 이름은  "  + fileName);
		System.out.println(fullName + "의 확장자는  " + ext);
	}
}
