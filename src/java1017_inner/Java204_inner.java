package java1017_inner;

class OuterLocal{
	private int x;
	static int y;
	final private int z = 10;
	
	public void call(int a) {
		final int b = 20;
		int c = 30;
		
		//a = 300;
		//System.out.println(a);
		// Inner클래스에서 받아온 인자를 참조하게되면 받아온 인자는 final처리가 되어 값을 변경할 수 없다.
		// 옛날에는 Inner클래스를 사용하려면 인자에 무조건 final을 붙여야 했지만 Inner클래스가 아닌 내부메소드에서 받아온 인자를 사용하는 경우도 있기때문에 Inner클래스에서 사용되지 않으면 값을 변경가능하다.
		
		//c = 50;
		// a와 같은 이유에서 오류가 발생한다.
		class InnerLocal{
			void prn() {
				x = 5;
				y = 150;
				System.out.println("x:"+x);
				System.out.println("y:"+y);
				System.out.println("z:"+z);
				System.out.println("a:"+a);
				System.out.println("b:"+b);
				System.out.println("c:"+c);
			}
		}
		
		// 메소드안에 선언된 클래스는 메소드 안에서 객체생성과 함수실행을 해야한다.
		InnerLocal inner = new InnerLocal();
		inner.prn();
	}
}

public class Java204_inner {
	public static void main(String[] args) {
		OuterLocal outer = new OuterLocal();
		outer.call(100);
		
	}
}
