package java1002_api;

/*
 * java.lang.String : 불변
 * java.lang.StringBuffer : 가변, 비동기화
 * java.lang.StringBuilder : 가변, 동기화
 */

public class Java129_StringBuffer {
	public static void main(String[] args) {
		String sg = new String("java test");
		System.out.println(sg.replace("java", "jsp"));
		System.out.println(sg);
		
		System.out.println("============================");
		StringBuffer sb = new StringBuffer("spring test");
		System.out.println(sb.replace(0, 6, "framework"));
		System.out.println(sb.toString());
		System.out.println(sb);
	}
}
