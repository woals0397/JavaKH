package java0913_array;

/*
 * num배열에 저장된 요소의 합계를 구하는 프로그램을 구현하시오.
 * 
 * [출력결과]
 * 합계 : 45
 */

public class Java043_array {
	public static void main(String[] args) {
		int[] num = new int[] {22, 3, 8, 12};
		int sum = 0;
		
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		
		System.out.println("합계 : " + sum);
	}
}
