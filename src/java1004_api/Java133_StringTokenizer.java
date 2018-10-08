package java1004_api;

import java.util.StringTokenizer;

public class Java133_StringTokenizer {
	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("java,,jsp/spring", ",/");
		System.out.println("토큰갯수:" + st.countTokens());
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
		System.out.println("========================");
		
		String[] arr = new String("java,,jsp/spring").split("[,/]"); // ,,사이도 공백으로 인식된다.
		System.out.println("배열크기:" + arr.length);
		for(String ss : arr)
			System.out.println(ss);
	}
}
