package java1017_thread.prob;

class VendingMachine{
	public String getDrink() {
		return null;
	}
	
	public void putDrink(String drink) {
		
	}
}

class Producer extends Thread{
	public Producer(VendingMachine vm) {
		
	}

	@Override
	public void run() {
		for(int i = 1; i <= 10; i++)
			System.out.println(Thread.currentThread().getName() + ": 음료수 No. " + i + " 자판기에 넣기");
	}
}

class Consumer extends Thread{
	public Consumer(VendingMachine vm) {
		
	}

	@Override
	public void run() {
		for(int i = 1; i <= 10; i++)
			System.out.println(Thread.currentThread().getName() + ": 음료수 No. " + i + " 꺼내먹음");
	}
}

public class Prob001_thread {

	public static void main(String[] args) {		
		VendingMachine vm = new VendingMachine();
		
		Producer p = new Producer(vm);
		Consumer c = new Consumer(vm);
		
		Thread t1 = new Thread(p, "생산자");
		Thread t2 = new Thread(c, "소비자");
		
		t1.start();
		t2.start();
	}//end main()

}//end class
