package java0911_basic.prob;
/*
 * data변수의 값이 대문자 이면 'A', 소문자이면 'a'을 
 * 출력하는 프로그램을 구현하시오.
 * [실행결과]
 * a
 */
public class Prob02 {

	public static void main(String[] args) {
		char data = 'b';
		
		// 여기에 작성하시오.
		// 'A' >= data <='Z' (수학)
		//  data >= 'A' && data <='Z' (프로그램) 
		char res = (int)data >= 97 ? 'a' : 'A';
		System.out.println(res);
		
		
		
	}//end main()

}//end class











