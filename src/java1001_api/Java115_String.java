package java1001_api;

class StringTest{
	private char[] arr;
	
	public StringTest() {
		
	}
	
	public StringTest(char[] arr) {
		this.arr = arr;
	}
	
	public char[] toChar() {
		return arr;
	}
	
	public int length() {
		return arr.length;
	}
	
	public char charAt(int index) {
		return arr[index];
	}
	
	public boolean isUpperCase(int index) {
		/*
		if(arr[index] >= 'A' && arr[index] <= 'Z')
			return true;
		else
			return false;
		*/
		
		return arr[index] >= 'A' && arr[index] <= 'Z';
	}
}


public class Java115_String {
	public static void main(String[] args) {
		char[] data = new char[] {'j', 'A', 'v', 'a'};
		StringTest st = new StringTest(data);
		System.out.println(st.toChar());		// java
		System.out.printf("%s\n", st.toChar()); // [C@1b6d3586
		System.out.println(st.length());
		System.out.println(st.charAt(2));
		System.out.println(st.isUpperCase(1));
		System.out.println(st.isUpperCase(3));
	}
}
