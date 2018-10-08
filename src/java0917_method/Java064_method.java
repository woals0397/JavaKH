package java0917_method;

public class Java064_method {
	public static void main(String[] args) {
		char[] data = new char[] {'a', 'b', 'c'};
		System.out.println(data); // abc
		System.out.printf("%s\n", data); // [C@1b6d3586
		System.out.println("data:" + data); // data:[C@1b6d3586
		
		int[] num = new int[] {1, 2, 3};
		System.out.println(num); // [I@4554617c
	}
}
