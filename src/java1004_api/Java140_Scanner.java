package java1004_api;

import java.util.Scanner;

public class Java140_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("부서:");
		String dept = sc.next();
		//String dept = sc.nextLine();
		
		//System.out.print("연봉:");
		int salary = sc.nextInt();
		
		//System.out.print("평균:");
		double avg = sc.nextDouble();
		
		System.out.printf("%s %d %.1f\n", dept, salary, avg);
		sc.close();
	}
}
