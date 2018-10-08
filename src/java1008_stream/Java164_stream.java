package java1008_stream;

import java.util.Scanner;

public class Java164_stream {
	public static void main(String[] args) {
		System.out.println("[순번 이름 평균]입력");
		Scanner input = new Scanner(System.in);
		
		System.out.printf("순번:%d\n", input.nextInt());
		System.out.printf("이름:%s\n", input.next());
		System.out.printf("평균:%.1f\n", input.nextDouble());
		input.close();
	}
}
