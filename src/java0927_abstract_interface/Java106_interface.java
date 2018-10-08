package java0927_abstract_interface;

import java.io.Serializable;
// java.lang에 있는 인터페이스들은 이미 JVM에 탑재가 되어있기 때문에 사용할때 import선언을 할 필요가 없다.

interface SampleA{
	void prn();
}


interface SampleB extends SampleA, Serializable{
	void call();
}


class Animal {
	void play() {
		System.out.println("animal");
	}
}

// extends ~~~ implements ~~~
class Life extends Animal implements SampleA, Serializable{
	
	@Override
	public void prn() {
		System.out.println("prnLife");
	}
}

class Life2 extends Animal implements SampleB{
	
	@Override
	public void prn() {
		System.out.println("prnLife2");
	}
	
	@Override
	public void call() {
		System.out.println("call");
	}
}


public class Java106_interface {

	public static void main(String[] args) {
		Life ee = new Life();
		ee.prn();
		ee.play();
	}
}
