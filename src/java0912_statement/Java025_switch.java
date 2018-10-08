package java0912_statement;

/*
 * switch(식){
 *	 case 값1 : 
 *		문장1;
 *		break;
 *	 case 값2 : 
 *		문장2;
 *		break;
 *	 case 값3 : 
 *		문장3;
 *		break;
 *	 default : 
 *		문장4;	 
 * }
 * 
 * 식의 결과 타입 : byte, short, char, int
 *            enum(JDK7버전 이상),  String(JDK7버전 이상)
 *            
 * switch~case에서 break을 만나면 현재 수행중인 조건문을 완전히 빠져나와 다음 문장을 수행한다.
 * 
 */

public class Java025_switch {

	public static void main(String[] args) {
		int jumsu = 100;
		char res;

		/*
		 * 
		 * if(jumsu >= 90) { 
		 * 	res = 'A'; 
		 * }else if(jumsu >= 80) { 
		 * 	res = 'B'; 
		 * }else if(jumsu >= 70) {
		 *  res = 'C'; 
		 * }else if(jumsu >= 60) {
		 *  res = 'D'; 
		 * }else {
		 *  res = 'F'; 
		 * }
		 * 
		 */

		switch (jumsu / 10) {
		case 10:
		case 9:
			res = 'A';
			break;
		case 8:
			res = 'B';
			break;
		case 7:
			res = 'C';
			break;
		case 6:
			res = 'D';
			break;
		default:
			res = 'F';
		}

		System.out.printf("%d점수는 %c학점입니다.\n", jumsu, res);

	}

}
