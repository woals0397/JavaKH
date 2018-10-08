package java0921_inheritance;

class SuperConst{
	int x;
	int y;

	public SuperConst(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class SubConst extends SuperConst{
	public SubConst() {
		// SuperConst클래스에 1개의 생성자가 정의되어 있으므로 JVM에서 기본생성자를 제공하지 않으므로 super()로 호출할 수 없다.
		// super();
		super(10, 40);
	}
}

public class Java094_inheritance {
	public static void main(String[] args) {
		SubConst sc = new SubConst();
		System.out.printf("x=%d y=%d\n",sc.x, sc.y);
	}
}
