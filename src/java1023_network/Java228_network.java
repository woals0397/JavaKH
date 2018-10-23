package java1023_network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Java228_network {
	public static void main(String[] args) {
		try {
			// InetAddress : ip주소를 다루기 위한 클래스이다.
			InetAddress ip = InetAddress.getByName("daum.net");
			System.out.printf("getHostName():%s\n", ip.getHostAddress());
			
			// host domain name리턴
			System.out.printf("getHostName():%s\n", ip.getHostName());
		} catch (UnknownHostException e) {			
			e.printStackTrace();
		}
		
	}
}
