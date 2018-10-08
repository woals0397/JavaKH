package java1004_api;

import java.util.Scanner;

public class Java139_Scanner {
	public static void main(String[] args) {
		// System.in : 입력 콘솔창하고 연결
		
		// Scanner는 목적지로부터 데이터를 읽어오는 클래스이다. new Scanner(목적지);
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.println(name);
		System.out.println("program end");
		sc.close();
	}
}
