package java1001_api;

// 배열크기 : length키워드
// 문자열길이 : length()메소드

public class Java117_String {
	public static void main(String[] args) {
		String str = new String("KoREa,jsp,java");
		System.out.println("문자열 길이:" + str.length());
		System.out.println("대문자:" + str.toUpperCase());
		System.out.println("소문자:" + str.toLowerCase());
		System.out.println("문자:" + str.charAt(1));
		System.out.println("인덱스:" + str.indexOf('a'));
		System.out.println("인덱스:" + str.indexOf(97));
		
		// 5인덱스부터 마지막까지 문자열 리턴
		// ,jsp,java
		System.out.println("범위:" + str.substring(5));
		
		// 2인덱스부터 8미만까지 문자열 리턴
		// REa,js
		System.out.println("범위:" + str.substring(2, 8));
		
		String[] arr = str.split(",");
		for(String data : arr) {
			System.out.println(data);
		}
		
		// int -> String 
		int x = 10;
		int y = 20;
		String s1 = String.valueOf(x);
		String s2 = String.valueOf(y);
		System.out.printf("%s + %s = %s\n", s1, s2, s1+s2);	// 10 + 20 = 1020
		
		// char[] -> String
		char[] dn = {'1', '2', '3'};
		String s3 = String.valueOf(dn);
		System.out.println(s3);	// 123
	}
}
