package java1023_network;

import java.net.MalformedURLException;
import java.net.URL;

public class Java229_network {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://realestate.daum.net/?nil_profile=mini&nil_src=realestate");
			System.out.printf("getHost():%s\n", url.getHost());
			System.out.printf("getPort():%s\n", url.getPort());
			System.out.printf("getProtocol:%s\n", url.getProtocol());
			System.out.printf("getPath:%s\n", url.getPath());
			System.out.printf("getQuery:%s\n", url.getQuery());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
