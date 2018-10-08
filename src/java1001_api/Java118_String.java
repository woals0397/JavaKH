package java1001_api;

/*
 * [출력결과]
 * ip:127.0.0.1
 * port:8080
 */

public class Java118_String {
	
	public static void main(String[] args) {
		String sn = "127.0.0.1:8080";
		
		System.out.println("ip:" + sn.split(":")[0]);
		System.out.println("port:" + sn.split(":")[1]);
	}
	
}
