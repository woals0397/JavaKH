package java1017_inner;

abstract class InnerAnonymous{
	abstract void prn();
}

class Test extends InnerAnonymous{
	@Override
	void prn() {
		System.out.println(10);
	}
}

class OuterAnonymous{
	private int x;
	public void call() {
		/*
		InnerAnonymous tt = new InnerAnonymous() {
			@Override
			void prn() {
				x = 5;
				System.out.println("x:" + x);
			}
		};
		tt.prn();
		*/
		
		new InnerAnonymous() {
			@Override
			void prn() {
				x = 5;
				System.out.println("x:" + x);
			}
		}.prn();
	}
}

public class Java205_inner {
	public static void main(String[] args) {
		Test tt = new Test();
		tt.prn();
		
		OuterAnonymous outer = new OuterAnonymous();
		outer.call();
	}
}
