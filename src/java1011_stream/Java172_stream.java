package java1011_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Java172_stream {
	public static void main(String[] args) {
		DataOutputStream ds = null;
		FileOutputStream fs = null;
		DataInputStream di = null;
		FileInputStream is = null;
		
		try {
			fs = new FileOutputStream("src/java1011_stream/sample.txt");
			ds = new DataOutputStream(fs);
			ds.writeInt(66);	// B 유니코드값으로 작성된다.
			ds.write(65); 		// A
			ds.writeDouble(10.5);
			ds.writeChar('a');
			ds.writeUTF("java");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
