package java0914_array;

// 실수의 기본타입 double, 정수의 기본타입 int

public class Java045_array {

	public static void main(String[] args) {
		int[] data1 = new int[3]; // 기본값 0     출력 0
		long[] data2 = new long[3]; // 기본값 0L   출력 0
		float[] data3 = new float[3]; // 기본값 0.0f   출력 0.0
		double[] data4 = new double[3]; // 기본값 0.0   출력 0.0
		char[] data5 = new char[3]; // 기본값 \u0000   출력 아무것도 출력안됨 
		boolean[] data6 = new boolean[3]; // 기본값 false   출력 false
		String[] data7 = new String[3]; // 기본값 null   출력 null
		
		for(int i = 0; i < data7.length; i++) {
			System.out.println(data7[i]);
		}
		
		System.out.println("====================================");
		char a = ' ';
		char b = '\u0020';
		char c = '\u0000';
		
		// char배열의 기본값 \u0000는 공백이 아니고 어떤값을 저장할 수 있는 상태를 뜻한다.
		// \u0020이 공백을 뜻한다.
		System.out.println(a == b); // true
		System.out.println(a == c); // false
	}

}
