package java0914_array;

public class Java051_array {
	public static void main(String[] args) {
		// 가변배열을 생성할때는 제일 마지막의 배열크기는 지정하지 않는다.
		// 메모리 손실을 최소화 하도록 가변배열을 제공한다.
		int[][] num = new int[3][];
		
		num[0] = new int[2]; // 0행 2열
		num[1] = new int[3]; // 1행 3열
		num[2] = new int[4]; // 2행 4열
		
		int[][] data = new int[][] {{1,2},{3,4,5},{6,7,8,9}};
		for(int row = 0; row < data.length; row++) {
			for(int col = 0; col < data[row].length; col++) {
				System.out.printf("%4d", data[row][col]);
			}
			System.out.println();
		}
	
		
	}
}
