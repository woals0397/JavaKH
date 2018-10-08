package java1008_stream;

import java.io.IOException;
import java.io.InputStream;

public class Java159_stream {
	public static void main(String[] args) {

		System.out.println("데이터 입력");

		// 콘솔창 목적지에 InputStream으로 연결
		InputStream is = System.in;

		try {
			int line = is.read(); // read(): 한 바이트를 읽어와서 유니코드로 리턴한다.
			System.out.println((char) line);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
