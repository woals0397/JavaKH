package java0914_array.prob;
/*
 * 4행 4열 data배열에 가로 세로 합계를 구하는 프로그램을 구현하시오.
 * [출력결과]
 *  1   2   3   6
 *  4   5   6  15
 *  7   8   9  24
 * 12  15  18  45
 */

public class Prob_02 {

	public static void main(String[] args) {
		int[][] data = new int[4][4];
		int cnt = 1;
		
		// 여기를 구현하시오.
		for(int i = 0; i < data.length-1; i++) {
			int rowSum = 0;
			for(int j = 0; j < data[i].length; j++) {
				if(j != 3) {
					data[i][j] = cnt;
					rowSum += cnt;
					System.out.printf("%4d", cnt++);
				}else {
					data[i][j] = rowSum;
					System.out.printf("%4d", rowSum);
					System.out.println();
				}
			}
		}
		
		for(int i = 0; i < 4; i++) {
			int colSum = 0;
			for(int j = 0; j <data.length; j++) {
				if(j != 3) {
					colSum += data[j][i];
				}else {
					System.out.printf("%4d", colSum);
				}			
			}
		}
		
		
	}// end main()

}// end class


