package java1004_api;

// num배열에 1부터 10까지의 값을 중복없이 저장하는 프로그램을 구현

public class Java138_Math {
	public static void main(String[] args) {
		int[] num = new int[5];
		
		for(int i = 0; i < num.length; i++) {	// 난수발생
			num[i] = (int)(Math.random()*10)+1;
			for(int j = 0; j < i; j++) {	// 중복체크
				if(num[i] == num[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int data : num)
			System.out.println(data);
	}
}
