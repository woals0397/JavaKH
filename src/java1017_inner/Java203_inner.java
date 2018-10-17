package java1017_inner;

class OuterStatic{
	private int x;
	static private int y;
	
	static void call() {
		y = 9;
		System.out.println(y);
	}
	
	static class InnerStatic{
		int z;
		static int k = 5;
		
		void prn() {
			//x = 40;	비static외부 자원을 static내부클래스에서 참조할 수 없다.
			y = 20;
			z = 30;
			System.out.println("y:" + y + " Z:" + z);
		}
	}
}

public class Java203_inner {
	public static void main(String[] args) {
		OuterStatic.call();
		OuterStatic.InnerStatic inner = new OuterStatic.InnerStatic();
		inner.prn();
		
		System.out.println(OuterStatic.InnerStatic.k);	// static자원은 객체생성없이 참조가능
	}
}
