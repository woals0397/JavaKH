package java1001_api;

/*
 * [출력결과]
 * java jsp spring
 */

public class Java121_String {
	public static void main(String[] args) {
		String stn = new String("java_jsp_spring");
		System.out.println(process(stn.toCharArray()));
	}
	
	public static char[] process(char arr[]) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == '_')
				arr[i] = ' ';
		}
		
		return arr;
	}
} 