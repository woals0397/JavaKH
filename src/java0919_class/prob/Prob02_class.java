﻿package java0919_class.prob;

/*
 * 1 연봉등급을 이용해서 각 사원의 연봉등급을 출력하는 로직을 구현하시오.
 * 
 * 2 실행결과 
 *  <<연봉등급표>>
 *  1000 2000 A
 *  2001 3000 B
 *  3001 4000 C
 *  4001 5000 D
 *  
 *  <<사원의 연봉등급>>
 *  홍길동님의 연봉은 C등급입니다.
 *  이영희님의 연봉은 A등급입니다.
 */
class SalesGrade {
	int hisal;
	int losal;
	char grade;

	SalesGrade(int losal, int hisal, char grade) {
		this.losal = losal;
		this.hisal = hisal;
		this.grade = grade;
	}

	public String toString() {
		return losal + " " + hisal + " " + grade;
	}
}

public class Prob02_class {

	public static void main(String[] args) {
		SalesGrade[] sg = new SalesGrade[4];
		sg[0] = new SalesGrade(1000, 2000, 'A');
		sg[1] = new SalesGrade(2001, 3000, 'B');
		sg[2] = new SalesGrade(3001, 4000, 'C');
		sg[3] = new SalesGrade(4001, 5000, 'D');

		System.out.println("<<연봉등급표 출력>>");
		display(sg);

		System.out.println("<<사원의 연봉등급 출력>>");
		display(sg, "홍길동", 3500);
		display(sg, "이영희", 1800);

	}// end main()

	public static void display(SalesGrade[] sg) {
		// 연봉등급표를 출력하는 로직구현
		for(int i = 0; i < sg.length; i++) {
			System.out.println(sg[i].toString());
		}
		
		System.out.println();

	}// end display()

	public static void display(SalesGrade[] sg, String name, int sales) {
		// 사원의 연봉등급을 출력하는 로직구현
		char grade = ' ';
		if(sales >= 1000 && sales <= 2000)
			grade = 'A';
		else if(sales > 2000 && sales <= 3000)
			grade = 'B';
		else if(sales > 3000 && sales <= 4000)
			grade = 'c';
		else if(sales > 4000 && sales <= 5000)
			grade = 'D';
		
		System.out.printf("%s님의 연봉은 %c등급입니다.\n", name, grade);
	}// end display()

}// end class
