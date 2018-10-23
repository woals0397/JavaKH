package java1023_network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Java231_ChatServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.print("대기:");
			while (true) {
				Socket client = server.accept();
				System.out.printf("client가 %s로 접속\n", client.getInetAddress().getHostAddress());

				Java231_ChatHandler handler = new Java231_ChatHandler(client);
				handler.initStart();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
