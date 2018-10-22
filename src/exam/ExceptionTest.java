package exam;

import java.util.Scanner;

class Calculator{
	public double getSum(int data){
		double sum = 0;
		
		if(data < 2 || data > 5) {
			try {
				new InvalidException("입력 값에 오류가 있습니다.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			for(int i = 1; i <= data; i++)
				sum += i;
			System.out.println("결과값:" + sum);
		}
		return sum;
	}
}

class InvalidException{
	public InvalidException(String message) throws Exception{
		System.out.println(message);
	}
}

public class ExceptionTest {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		cal.getSum(num);
	}
}
