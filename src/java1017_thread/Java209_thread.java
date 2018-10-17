package java1017_thread;

class PriorityTest extends Thread{
	@Override
	public void run() {
		for(int i = 0; i <= 5; i++) {
			System.out.printf("%s priority=%d i=%d\n", getName(), getPriority(), i);
		}
	}
}

public class Java209_thread {
	public static void main(String[] args) {
		PriorityTest t1 = new PriorityTest();
		t1.setName("user");	// thread이름
		t1.start();
		
		/*
		 * 스레드의 우선순위는 1~10까지 지정할 수 있다.
		 * 스레드의 기본값은 5이다.
		 */
		
		PriorityTest t2 = new PriorityTest();
		t2.setPriority(Thread.MAX_PRIORITY);	// 10
		t2.start();
		
		PriorityTest t3 = new PriorityTest();
		t3.setPriority(8);
		t3.start();
	}
}
