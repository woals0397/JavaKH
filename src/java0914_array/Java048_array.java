package java0914_array;

public class Java048_array {
	public static void main(String[] args) {
		// 3행 2열
		int[][] num = new int[][] {{1,2}, {3,4}, {5,6}};
		
		for(int row = 0; row < num.length; row++) {
			for(int col = 0; col < num[row].length; col++) {
				System.out.printf("%4d", num[row][col]);
			}
			System.out.println();
		}
		
	}
}
