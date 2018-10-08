package java0917_method;

public class Java055_method {
	
	public static void main(String[] args) {
		int a = 4, b = 2, c = 5;
		int[] num = new int[] {2, 3};
		int[] data = new int[] {1, 5, 8, 9};
		
		System.out.println(process(a,b,c));
		System.out.println(plus(num));
		System.out.println(plus(data));
	}
	
	public static int process(int x, int y, int z) { // 값이 복사된다.
		return x + y + z;
	}
	
	public static int plus(int[] arr) { // 주소값이 복사된다.
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
}
