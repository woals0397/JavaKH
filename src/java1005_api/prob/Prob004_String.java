package java1005_api.prob;

/*
 * [출력결과]
 *  영어 소문자 갯수:3
 *  영어 대문자 갯수:3
 *  숫자 갯수:2
 */

public class Prob004_String {

	public static void main(String[] args) {
		String data = "ke4RdTA5";

		display(process(data));
	}// end main()

	public static char[] process(String data) {
		return data.toCharArray();
	}// end process()

	public static void display(char[] arr) {
		int upper = 0;
		int lower = 0;
		int digit = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(Character.isUpperCase(arr[i]))
				upper++;
			else if(Character.isLowerCase(arr[i]))
				lower++;
			else if(Character.isDigit(arr[i]))
				digit++;
		}
		
		System.out.println("영어 소문자 갯수:" + lower + "\n영어 대문자 갯수:" + upper + "\n숫자 갯수:" + digit);
		
	}// end display()

}// end class
