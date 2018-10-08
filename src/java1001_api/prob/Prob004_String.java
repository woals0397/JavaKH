package java1001_api.prob;

/* 
 * arr매개변수에서 '-'은 공백으로 , '/'은 ':'으로 변경한후
	리턴하는 프로그램을 구현하시오
 * [출력결과]
 * 
 * basic:java  web:jsp  framework:spring
 * 
 */
public class Prob004_String {

	public static void main(String[] args) {

		String data = "basic/java_web/jsp_framework/spring";
		char[] arr=data.toCharArray();
		System.out.println(process(data.toCharArray()));
	}// end main()

	static String process(char[] arr) {
		// arr매개변수에서 '_'은 공백으로 , '/'은 ':'으로 변경한후
		// 리턴하는 프로그램을 구현하시오.
		String res = "";
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == '_')
				res += ' ';
			else if(arr[i] == '/')
				res += ':';
			else
				res += arr[i];
		}
		
		return res;
	}// end process()

}// end class



















