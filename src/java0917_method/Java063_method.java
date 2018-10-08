package java0917_method;


/*
 * [출력결과]
 * java test
 * tset avaj
 * java test
 */

public class Java063_method {
	
	public static void main(String[] args) {
		char[] arr = {'j', 'a', 'v', 'a', ' ', 't', 'e', 's', 't'};
		
		System.out.println(arr);
		System.out.println(reverse(arr));
		System.out.println(arr);
	}
	
	public static char[] reverse(char[] data) {
		// data의 요소 앞뒤를 바꿔서 리턴하는 프로그램을 구현하세요.
		char[] res = new char[data.length];
		
		for(int i = 0; i < data.length; i++) {
			res[i] = data[data.length-1-i];
		}
		
		return res;
	}
}
