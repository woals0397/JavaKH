package java1011_stream;

import java.io.File;

/*
 * javademo의 폴더와 파일 리스트를 출력
 */

public class Java170_stream {
	public static void main(String[] args) {
		File file = new File(".");	// . (현재위치)
		System.out.println(file.getAbsolutePath());
		File[] listFile = file.listFiles();
		for(File fe : listFile)
			System.out.println(fe.getName());
	}
}
