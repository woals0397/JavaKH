package java1002_api;

import java.util.StringTokenizer;

public class Java132_StringTokenizer {
	
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("java,jsp", ",");
		/*
		// nextToken()을 실행하면 메모리에 있는 값을 복사하는게 아닌 완전히 꺼내와 메모리에서 삭제된다.
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		*/
		
		/*
		for(int i = 0; i < st.countTokens(); i++) {
			// for문이 돌때마다 nextToken()으로 메모리에서 하나씩 꺼내오게 되면 countTokens()값이 계속해서 줄어들어 원하는 결과값을 얻지 못한다.
			System.out.println(st.nextToken());
		}
		*/
		
		// 메모리에 저장된 토큰이 있으면 true 없으면 false을 리턴한다.
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
