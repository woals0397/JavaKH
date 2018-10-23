package java1023_network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Java230_ClientSocket {
	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			//1 서버연결요청(서버주소, 포트번호)
			socket = new Socket("127.0.0.1", 7777);
			
			//2 입출력스트림 연결
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(os);
			
			//3 서버에 정보를 보냄
			ow.write("클라이언트의 정보를 보냄");
			ow.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
