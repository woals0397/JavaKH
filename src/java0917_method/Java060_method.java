package java0917_method;

public class Java060_method {
	public static void main(String[] args) {
		char[] data = new char[] {'j', 'A', 'v', 'a'};
		System.out.println("문자열의 길이 : " + length(data));
		System.out.println("2인덱스의 요소값 가져오기 : " + charAt(data, 2));
	}
	
	public static int length(char[] data) {
		// data 배열의 크기를 리턴하는 프로그램을 구현하세요.
		return data.length;
	}
	
	public static char charAt(char[] data, int index) {
		// data 배열에서 index에 해당하는 문자를 리턴하는 프로그램을 구현하세요.
		return data[index];
	}
}
