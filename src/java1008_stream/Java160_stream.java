package java1008_stream;

import java.io.IOException;
import java.io.InputStream;


/*
 * carriage return : 줄의 처음으로 이동(13)
 * line feed : 다음 줄로 이동(10)
 */

public class Java160_stream {
	public static void main(String[] args) {
		System.out.println("데이터 입력:");
		InputStream is = System.in;
		
		int data;
		
		try {
			// 1. is.read()을 호출해서 문자를 읽어옴
			// 2. read()에서 리턴해주는 문자를 data변수에 저장
			// 3. data변수의 값과 13을 비교
			// 4. while문의 조건식이 true이면 블록을 수행
			while((data=is.read()) != 13) {
				System.out.println((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
