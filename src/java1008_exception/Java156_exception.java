package java1008_exception;

public class Java156_exception {
	public static void main(String[] args) {
		String data1 = "test";
		String data2 = "2";

		try {
			int x = Integer.parseInt(data1);
			int y = Integer.parseInt(data2);
			process(x, y);
		} catch (NumberFormatException ex) {
			System.out.println(ex.toString());
		} catch (ArithmeticException ex) {
			System.out.println(ex.toString());
		}

		System.out.println("program end");
	}

	public static void process(int x, int y) throws ArithmeticException {
		int res = x / y;
		System.out.println(res);
	}
}
