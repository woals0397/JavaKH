package java0912_statement;

public class Java029_for {

	public static void main(String[] args) {
		int sum = 0; // 누적을 저장할 변수
		int i;
		
		for(i = 1; ; i++) {
			sum = sum+i;
			if(sum >= 15) {
				break; // 현재 수행중인 반복문을 빠져나옴
			}
		}
		
		System.out.printf("i=%d sum=%d\n", i, sum);

	}

}
