package java0914_array;

/*
 * [출력결과]
 * 짝수: 42
 * 홀수: 3
 */

public class Java044_array {

	public static void main(String[] args) {
		int[] num = new int[] {22, 3, 8, 12};
		int even = 0; // 짝수
		int odd = 0; // 홀수
		
		for(int i = 0; i < num.length; i++) {
			if(num[i]%2 == 0) { // 짝수이냐?
				even += num[i];
			}else { // 홀수이냐?
				odd += num[i];
			}
		}

		System.out.println("짝수: " + even);
		System.out.println("홀수: " + odd);
		
	}

}
