package java1008_exception;

public class Java157_exception {
	public static void main(String[] args) {
		int num = 5;
		process(num);
		System.out.println("Korea");
	}
	
	public static void process(int data) {
		try {
			if(data<10) {
				throw new ArithmeticException("10이상만 입력하세요.");
			}
		}catch(ArithmeticException ex){
			System.out.println(ex.toString());
		}
	}
}
