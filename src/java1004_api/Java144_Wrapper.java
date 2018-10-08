package java1004_api;

public class Java144_Wrapper {
	public static void main(String[] args) {
		char data = 'a';
		
		if(data >= 'A' && data <= 'Z')
			System.out.println("대문자");
		else
			System.out.println("소문자");
		
		// 대문자 검색
		System.out.println(Character.isUpperCase(data));
		
		// 소문자 검색
		System.out.println(Character.isLowerCase(data));
		
		// 숫자 검색
		System.out.println(Character.isDigit(data));
		
		// 대문자
		System.out.println(Character.toUpperCase(data));
		
		// 소문자
		System.out.println(Character.toLowerCase(data));
		
	}
}
