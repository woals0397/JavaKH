package java0914_array;

/*
 * [데이타]
 * 홍길동	90	  85	40
 * 갑동이	100	  35	75
 * 
 * [출력결과]
 * 홍길동	90    85	40	215	 71.7
 * 갑동이	100	  35	75	210	 70.0
 */


public class Java049_array {
	public static void main(String[] args) {
		String[] name = new String[] {"홍길동", "갑동이"};
		int[][] jumsu = new int[][] {{90, 85, 40}, {100, 35, 75}};
		
		
			for(int row = 0; row < jumsu.length; row++) {
				int sum = 0;
				
				System.out.printf("%-6s", name[row]);	
				for(int col = 0; col < jumsu[row].length; col++) {
					System.out.printf("%5d", jumsu[row][col]);
					sum += jumsu[row][col];
				}
				System.out.printf("%5d %6.1f", sum, sum/3.0);
				System.out.println();
			}
		
	}
}
