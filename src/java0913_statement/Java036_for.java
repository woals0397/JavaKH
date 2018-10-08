package java0913_statement;

/*
 * 	1 2 3 4 5
 * 	1 2 3 4 5
 * 	1 2 3 4 5
 * 	1 2 3 4 5
 */

public class Java036_for {

	public static void main(String[] args) {
		for(int row = 1; row <= 4; row++) { // 행처리
			for(int col = 1; col <= 5; col++) { // 열처리
				System.out.printf("%4d", col);
			}
			System.out.println();
		}
	}

}
