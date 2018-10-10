package java1008_stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Java166_stream {
	public static void main(String[] args) {
		File file = new File("sample.txt");
		FileReader fr = null;
		BufferedReader br = null;
		
		int data;
		
		// 한 바이트씩 읽어와서 처리
		try {
			fr = new FileReader(file);
			// read() : 파일의 끝일때 -1을 리턴한다.
			while((data=fr.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("//////////////////////////");
		
		// 한 라인씩 읽어와서 처리
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);	// BufferedReader에는 한줄씩 읽어오는 메서드 존재
			String line = "";
			// 파일의 끝이면 readLine()는 null을 리턴한다.
			while((line=br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("//////////////////////////////");
		
		Scanner input = null;
		
		try {
			input = new Scanner(file);
			while(input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			input.close();
		}
		
	}
}
