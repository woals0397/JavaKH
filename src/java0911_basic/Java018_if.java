package java0911_basic;

/*
 * 조건식을 만족할때만 수행할 문장이 있는 경우
 * if(저건식){
 * 	수행할 문장;
 * }
 */

public class Java018_if {

	public static void main(String[] args) {
		int num = 10;
		
		if(num>0) {
			System.out.printf("%d는 자연수입니다.\n", num);
		}
		
		System.out.println("Program End");
		System.out.println("======================================");
		
		int data = 7;
		if(data%3 != 0) {
			System.out.printf("%d는 3의 배수가 아닙니다.\n", data);
		}
		
	}

}
