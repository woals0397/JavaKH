package java1011_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Java168_stream {
	public static void main(String[] args) {
		File file = new File("src/java1011_stream/song.txt");
		RandomAccessFile raf = null;
		String stn = new String("\r\nMaron 5 - Daylight, Sunday Moring\r\n");
		try {
			raf = new RandomAccessFile(file, "rw");	// 쓰기(write)만은 불가능하다. 항상 읽기쓰기("rw")가 동시에 이루어진다.
			// song.txt파일의 총 길이를 리턴한다.
			long size = raf.length();
			// 파일의 끝으로 포인터를 이동한다.
			raf.seek(size);
			raf.writeBytes(stn);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}
}
