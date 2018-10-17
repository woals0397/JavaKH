package java1017_thread;

/*
 동기화                          비동기화
StringBuilder   StringBuffer
Vector          ArrayList
Hashtable       HashMap

파일 : Ms-word프로그램
프로세스: 메모리에서 실행중인 프로그램이다.
 게임프로그램-게임, 음악, 채팅
스레드(thread) : 프로세스에서 독립적으로 실행되는 단위이다.

자바에서 스레드 생성을 위해 제공해주는 2가지 방법
1. java.lang.Thread클래스
2. java.lang.Runnable 인터페이스

스케줄링
 : 스레드가 생성되어 실행될 때 시스템의 여러 자원을 해당 스레드에게 
     할당하는 작업

선점형 스케줄링
  :하나의 스레드가 cpu을 할당받아 실행하고 있을 때 우선순위가
     높은 다른 스레드가 cpu를 강제로 빼앗아가 사용할 수 있는 스케줄링 
   기법이다.
 */

class User extends Thread{
	public User() {
		
	}
	
	@Override
	public void run() {
		// thread로 실행시켜줄 문장들은 run()메소드에서 구현한다.
		for(int i = 0; i <= 5; i++) {
			System.out.printf("%s i = %d\n", getName(), i);
		}
	}
}

public class Java206_thread {
	// 실행 -> main스레드 -> main메소드
	public static void main(String[] args) {
		User us = new User();
		//us.run();		단지 메소드호출일뿐 스레드로 실행시키는게 아니라 메인스레드 하나에서 처리된다.
		us.start();		// 스레드 생성
		
		for(int j = 0; j <= 5; j++) {
			System.out.printf("%s i = %d\n", Thread.currentThread().getName(), j);
		}
	}
}
