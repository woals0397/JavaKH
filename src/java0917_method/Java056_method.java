package java0917_method;

public class Java056_method {
	public static void main(String[] args) {
		int a = 10, b = 20;
		int c = a, d = b;	// 값복사(Call by value)
		
		System.out.printf("a=%d, b = %d\n", a, b);
		System.out.printf("c=%d, d = %d\n", c, d);
		
		System.out.println("===========swap 기본데이터 타입=============");
		/*
		int temp = c;
		c = d;
		d = temp;
		*/
		int temp = d;
		d = c;
		c = temp;
		
		System.out.printf("a=%d, b = %d\n", a, b);
		System.out.printf("c=%d, d = %d\n", c, d);
		
		System.out.println("/////////////////////////////////////////");
		int[] num = new int[] {10, 20};
		int[] arr = num; // 주소복사(Call by reference)
		
		System.out.printf("num[0]=%d, num[1] = %d\n", num[0], num[1]);
		System.out.printf("arr[0]=%d, arr[1] = %d\n", arr[0], arr[1]);
		
		System.out.println("===========swap 참조데이터 타입=============");
		/*
		int imsi = arr[0];
		arr[0] = arr[1];
		arr[1] = imsi;
		*/
		int imsi = arr[1];
		arr[1] = arr[0];
		arr[0] = imsi;
		
		System.out.printf("num[0]=%d, num[1] = %d\n", num[0], num[1]);
		System.out.printf("arr[0]=%d, arr[1] = %d\n", arr[0], arr[1]);
		
	}
}
