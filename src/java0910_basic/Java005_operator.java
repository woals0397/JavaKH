package java0910_basic;

/*
 * 연산자(operator)
 *  : 어떠한 기능을 수행하는 기호(+, -, *, /, %, >, <, ==같다, !=다르다)
 *  
 * 피연산자(operand)
 *  : 연산자의 작업 대상(변수, 상수, 리터널, 수식)
 *  
 * 연산자의 종류
 * 1 산술연산자 : +, -, *, /, %
 * 2 비교연산자 : >, <, >=, <=, ==, !=
 * 3 논리연산자 : &&(end), ||(or), !(not)
 * 4 삼항연산자(조건연산자) : 조건식 ? 참 : 거짓
 * 5 대입연산자 : =, +=, -=, *=, /=
 * 6 단항연산자 : ++(1씩 증가), --(1씩 감소), a++ --a
 */

public class Java005_operator {
	public static void main(String[] args) {
		int kor = 10;
		int eng = 20;

		// int = int + int
		int result = kor + eng;
		System.out.println(result);

		double avg = 4.5;
		// 식에서 사용된 값의 데이터 타입이 다르면 큰 데이터 타입으로 결과를 리턴한다.
		// double = int + double
		double result2 = kor + avg;
		System.out.println(result2);

		short numa = 3;
		short numb = 4;
		// int이하 데이터타입끼리 연산이 되면 결과는 항상 int로 나온다.
		// short = (short)(short + short)
		short result3 = (short)(numa + numb);
		
		// int = byte + short
		// int = char + short
		// int = byte + int
		// int = byte + byte
		
		char data = 'a';
		// 대문자 'A'로 출력
		System.out.println((char)(data-32));
		
	}
}
