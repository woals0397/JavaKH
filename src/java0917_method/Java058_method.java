package java0917_method;

/*
 * [출력결과]
 * e의 대문자는 E입니다.
 */

public class Java058_method {
	public static void main(String[] args) {
		//[조건] : data변수의 값은 소문자만 입력한다.
		char data = 'a';
		char code = process(data);
		System.out.printf("%c의 대문자는 %c입니다.\n", data, code);
	}
	
	// data매개변수의 값을 대문자로 변경해서 리턴
	public static char process(char data) {
		// 1 대문자와 소문자 유니코드값
		// 2 대문자와 소문자 차이
		// 3 캐스팅  int -> char
		return (char)(data-32);
	}
}
