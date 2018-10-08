package java1008_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Java155_exception {
	public static void main(String[] args) {
		File file = new File("sample.txt");
		FileReader fr = null;

		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException ex) {
			System.out.println(ex.toString());
		} finally {
			try {
				fr.close();
			} catch (IOException ex) {
				System.out.println(ex.toString());
			} catch (NullPointerException ex) {
				System.out.println(ex.toString());
			}

		}
	}
}
