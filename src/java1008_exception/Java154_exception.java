package java1008_exception;

public class Java154_exception {
	public static void main(String[] args) {
		String data1 = "10";
		String data2 = "0";
		
		try {
		int x = Integer.parseInt(data1);
		int y = Integer.parseInt(data2);
		int res =x/y;
		System.out.println(res);
		}catch(NumberFormatException ex) {
			System.out.println("숫자를 입력하세요.");
		}catch(ArithmeticException ex) {
			System.out.println("분모는 0을 사용할 수 없습니다.");
		}catch(RuntimeException ex) {
			System.out.println(ex.toString());
		}
		System.out.println("program end");
	}
}
