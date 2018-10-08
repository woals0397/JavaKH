package java0912_statement;

/*
 * for(초기식; 조건식; 증감식){
 * 	   수행할 문장;
 * }
 * 
 * 
 * 1 조건식이  true일때까지만 반복문을 실행한다.
 * 2 for문 실행순서
 *   초기식 -> 조건식(true) -> 수행할 문장 -> 증감식
 *       -> 조건식(true) -> 수행할 문장 -> 증감식
 *       -> 조건식(false) -> for문을 빠져나옴
 * 3 초기식은 한번만 수행한다.
 * 4 초기식, 조건식, 증감식은 생략할 수 있지만 for( ; ; ){ } 세미콜론 필수
 * 5 초기식, 증감식은 생략하거나 여러개 사용할 수 있다.
 *   조건식은 생략하거나 한개만 사용한다.
 *   for(int a = 3, b = 4; ; sum+=a, hap+=b){ }
 * 6 조건식을 생략하면 언제나 true로 인식한다.
 *   for문의 종료 시점을 정확히 파악할 수 없을때 for문을 무한루프로 설정한다.
 */

public class Java028_for {

	public static void main(String[] args) {
		/*
		 * System.out.println(1); 
		 * System.out.println(2); 
		 * System.out.println(3);
		 * System.out.println(4); 
		 * System.out.println(5);
		 */
		
		for(int num = 1, sum = 1; num < 6; num++, sum+=num) {	// 여러개의 초기식과 증감식이 사용가능하나 조건식은 1개(&&, ||사용가능)만 가능하다.
			System.out.printf("%2d, %2d\n", num, sum);
		}
		
	}

}
