package java1004_api;

import java.util.Scanner;

/*
 * 이름, 학점을 입력하는 프로그램을 구현하시오.
 * 입력 : 홍길동, 80, 93
 * 
 * [출력결과]
 * 이름: 홍길동
 * 국어: 80
 * 영어: 93
 * 평균: 86.5 (double로 계산)
 */

public class Java146_Wrapper {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("입력: ");
		String data = input.nextLine();
		String[] temp = data.split(", ");
		
		System.out.println("이름: " + temp[0]);
		System.out.println("국어: " + temp[1]);
		System.out.println("영어: " + temp[2]);
		System.out.println("평균: " + (Double.parseDouble(temp[1])+Double.parseDouble(temp[2]))/2);
		input.close();
	}
}
