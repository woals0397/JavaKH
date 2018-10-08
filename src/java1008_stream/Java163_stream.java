package java1008_stream;

import java.io.IOException;
import java.util.Scanner;

public class Java163_stream {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x, y;

		System.out.print("x: ");
		x = input.nextInt();

		System.out.print("y: ");
		y = input.nextInt();
		
		System.out.printf("%d + %d = %d\n", x, y, x + y);
		
		input.close();
	}
}
