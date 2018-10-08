package java0913_statement;

/*
 * 3행  X 4열
 * 1	2	3	4
 * 5	6	7	8
 * 9   10  11  12
 */

public class Java035_for {

	public static void main(String[] args) {
		/*		
		for(int i = 0; i <= 2; i++) {
			System.out.printf("%d %4d %4d %4d\n", i*4+1, i*4+2, i*4+3, i*4+4);	
		}
		*/
		
		int cnt = 1;
		
		for(int row = 1; row <= 3; row++) { // 행처리
			for(int col = 1; col <= 4; col++) { // 열처리
				System.out.printf("%4d", cnt);
				cnt++;
			}
			System.out.println();
		}
	}

}
