package java0913_array;

// 변수 : 하나의 값을 저장하기 위한 메모리 공간

public class Java041_array {
	public static void main(String[] args) {
		int ko = 90;
		int en = 80;
		int jp = 40;
		
		// 배열선언 - 메모리 생성안됨
		int[] jumsu;
		// 배열생성 - 메모리 생성됨
		jumsu = new int[3];
		
		System.out.printf("ko=%d, en=%d, jp=%d\n", ko, en,jp);
		System.out.printf("[0]=%d, [1]=%d, [2]=%d\n", jumsu[0], jumsu[1], jumsu[2]);
		
		jumsu[0] = 90;
		jumsu[1] = 80;
		jumsu[2] = 40;
		System.out.printf("[0]=%d, [1]=%d, [2]=%d\n", jumsu[0], jumsu[1], jumsu[2]);
		System.out.println("=============================");
		
		// length키워드 : 배열의 크기를 리턴한다.
		for(int index = 0; index < jumsu.length; index++) {
			System.out.println(jumsu[index]);
		}
		
	}
}
