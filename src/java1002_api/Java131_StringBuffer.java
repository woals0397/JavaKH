package java1002_api;

public class Java131_StringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");
		
		//String <- StringBuffer
		String sn = sb.toString();
		
		display(sn.toCharArray());
	}
	
	public static void display(char[] data) {
		for(char cn : data) {
			System.out.println(cn);
		}
	}
}
