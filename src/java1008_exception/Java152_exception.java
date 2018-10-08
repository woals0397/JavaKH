package java1008_exception;

/*
 * 1 쓰레기(정확하지 않은 값)를 처리함-문제발생
 * 2 Exception장치로 해결
 * 3 정상종료-문제발생
 * 4 예외처리 try~catch~finally로 해결
 */

public class Java152_exception {
	public static void main(String[] args) {
		int[] num = new int[] {10, 20, 30};
		
		try {
			// 예외가 발생될 가능성이 있는 구문
			System.out.println(num[5]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			// 예외 발생 문제를 해결함
			System.out.println(ex.toString());
		}finally {
			// 무조건 실행
			System.out.println("예외 처리 종료");
		}
		
		System.out.println("program end");
		
	}
}
