package java1001_api;

/*
 * 문자열 관련 클래스
 * java.lang.String
 * java.lang.StringBuffer
 * java.lang.StringBuilder
 * java.lang.StringTokenizer
 */

public class Java116_String {
	
	public static void main(String[] args) {
		String sn = "java";
		String sg = "java";
		String st = new String("java");
		String ss= new String("java");
		
		// 주소비교
		System.out.printf("sn==sg:%b\n", sn==sg); // true
		System.out.printf("st==ss:%b\n", st==ss); // false
		
		// equals() : 문자열 비교
		System.out.printf("sn.equals(sg):%b\n", sn.equals(sg)); // true
		System.out.printf("st.equals(ss):%b\n", st.equals(ss)); // true
		
		// toString() : 메모리에 저장된 문자열 리턴
		System.out.println(sn.toString()); // java
		System.out.println(sn);			   // java
	}
	
}
