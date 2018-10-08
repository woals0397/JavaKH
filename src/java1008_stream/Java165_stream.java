package java1008_stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Java165_stream {
	public static void main(String[] args) {
		File file = new File("sample.txt");
		System.out.println(file.exists());	// file존재유무 확인
		System.out.println(file.isFile());
		System.out.println(file.length());
		System.out.println(file.canRead());	// 읽기권한
		
		FileWriter fw = null;
		
		try {
			// true : append(+), false: update(새로쓰기) 기본(false)
			fw = new FileWriter(file, true);
			fw.write("java\r\n");	// 파일에 쓰여지는게 아니라 buffer에 쓰여진다.
			fw.write("jsp\r\n");
			fw.flush();				// buffer에 있는 내용을 작성한다.
			fw.write("spring");
			//fw.close();
			fw.write("oracle");		// Error => close한 후에는 다시 객체생성 후에 작성이 가능하다.
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
