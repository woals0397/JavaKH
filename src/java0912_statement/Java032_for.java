package java0912_statement;

public class Java032_for {

	public static void main(String[] args) {
		int sum = 0;
		
		// 1부터 10까지 누적된 값을 출력
		// sum = 55
		for(int num = 0; num <= 10; num++) {
			sum += num; // sum = sum + num;
		}
		
		System.out.println("sum = " + sum);

	}

}
