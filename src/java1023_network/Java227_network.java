package java1023_network;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/*
 * 네트워크: 데이터 통신이라는 공통의 목적을 위하여 두 개 이상의 컴퓨터를 케이블 등으로 연결해 서로 데이터를 교환할 수 있도록 만든 시스템이다.
 * 
 * 서버(Server): 정보를 제공하는 컴퓨터
 * 클라이언트(Client): 정보를 제공받는 컴퓨터
 * 
 * 
 */

public class Java227_network {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.daum.net");
			URLConnection conn = url.openConnection();
			Scanner sc = new Scanner(conn.getInputStream());
			while(sc.hasNextLine())
				System.out.println(sc.nextLine());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
