package java0913_statement;

// 3의 배수만 제외하고 출력하는 프로그램
/*
 * 1
 * 2
 * 4
 * 5
 * 7
 * 8
 * 10
 */

public class Java034_for {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			/*if(i%3 != 0) {
				System.out.println(i);
			}*/
			
			if(i%3 == 0) {
				// 반복문에서 continue을 실행하면 조건식으로 이동한다.
				// for문에서 continue을 실행하면 증감식으로 이동한다.
				continue;
			}
			System.out.println(i);
		}

	}

}
