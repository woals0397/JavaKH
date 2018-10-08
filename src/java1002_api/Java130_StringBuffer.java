package java1002_api;

public class Java130_StringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");
		
		// 4인덱스에 ",jsp"문자열을 삽입한다.
		sb.insert(4,  ",jsp");
		System.out.println(sb.toString());
		
		// 4인덱스부터 8인덱스 미만 사이의 문자열을 삭제한다.
		sb.delete(4, 8);
		System.out.println(sb.toString());
		
		// 0인덱스의 문자를 삭제한다.
		sb.deleteCharAt(0);
		System.out.println(sb.toString());
		
		// 문자열을 반대로 변경해서 리턴한다.
		sb.reverse();
		System.out.println(sb.toString());
		
		System.out.println("=================================");
		String data = "mybatis orm";
		
		StringBuffer sf = new StringBuffer(data);
		sf.reverse();
		System.out.println(sf);
		
		System.out.println("=================================");
		char[] arr = new char[] {'k', 'o', 'r', 'e', 'a'};
		StringBuffer se = new StringBuffer();
		se.append(arr).reverse();
		System.out.println(se.toString());
		
		System.out.println("=================================");
		StringBuffer st = new StringBuffer(String.valueOf(arr));
		st.reverse();
		System.out.println(st.toString());
	}
}
