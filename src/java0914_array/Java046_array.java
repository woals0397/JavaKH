package java0914_array;

/*
 * data배열에서 대문자의 갯수를 출력하는 프로그램을 구현하세요.
 * 
 * [출력결과]
 * 대문자갯수 : 2
 */

public class Java046_array {
	public static void main(String[] args) {
		char[] data = new char[] {'a', 'b', 'F', 'R', 'a'};
		int cnt = 0; // 대문자 갯수를 저장하기 위한 변수
		
		for(int i = 0; i < data.length; i++) {
			if(data[i] < 97) {
				cnt++;
			}
		}
		
		System.out.println("대문자갯수 : " + cnt);
	}
}
