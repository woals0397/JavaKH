package java1011_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Java167_stream {
	public static void main(String[] args) {
		File file = new File("src/java1011_stream/score.txt");
		RandomAccessFile raf = null;
		
		try {
			// "r" : 읽기(read)만 가능하다.
			// "rw": 읽기(read) 쓰기(write)가 가능하다.
			raf = new RandomAccessFile(file, "r");
			// 현재 포인터 위치 리턴
			System.out.println(raf.getFilePointer());	// 0
			System.out.println((char)raf.read());		// read함수는 int값을 리턴한다. 즉 유니코드값이 리턴된다.
			System.out.println(raf.getFilePointer());	// 1
			System.out.println(raf.readLine());			// 현재 포인터가 있는 위치부터 한줄을 읽어온다.(만약 포인터가 중간에 있다면 그 앞부분은 읽어오지 않고 포인터위치부터 한줄을 읽어온다.)
			String line = raf.readLine();
			System.out.printf("%s  %d\n", line, line.length());
			System.out.println(raf.getFilePointer());	// 30
			raf.seek(4);	// 포인터위치 변경
			System.out.println(raf.getFilePointer());	// 4
			System.out.println(raf.readLine());			// 56/78/12
			
			raf.skipBytes(2);
			System.out.println(raf.readLine()); 		// ng:46/100/97
			
			raf.skipBytes(-2);							// skipBytes는 음수값은 적용이 안된다.
			System.out.println(raf.readLine()); 		// park:96/56/88
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
