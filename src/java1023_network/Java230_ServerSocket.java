package java1023_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Java230_ServerSocket {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket socket = null;
		try {
			//1 포트번호를 지정해서 서버 생성
			server = new ServerSocket(7777);
			System.out.print("대기:");
			//2 클라이언트 요청이 들어올때까지 대기
			socket = server.accept();
			
			//3 입출력스트림 연결
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);
			
			//4 클라이언트의 정보를 읽음
			System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
				server.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
}
