package java1017_thread;

class User2 implements Runnable{
	public User2() {
		
	}

	@Override
	public void run() {
		for(int i = 0; i <= 5; i++) {
			System.out.printf("%s i = %d\n", Thread.currentThread().getName(), i);
		}
	}
}

public class Java207_thread {
	public static void main(String[] args) {
		User2 us = new User2();
		new Thread(us).start();
		
		new Thread(new User2()).start();
		
		System.out.println("main thread");
	}
}
