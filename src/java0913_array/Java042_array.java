package java0913_array;

public class Java042_array {
	public static void main(String[] args) {
		/*
		int[] jumsu = new int[3]; // 배열선언 및 생성
		
		jumsu[0] = 90;
		jumsu[1] = 80;
		jumsu[2] = 40;
		*/
		
		// 배열생성할때 초기값을 할당하면 배열의 크기를 명시할 수 없다.
		int[] jumsu = new int[] {90,80,40};
		
		for(int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}
		
	}
}
