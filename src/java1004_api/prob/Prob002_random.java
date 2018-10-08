package java1004_api.prob;

/*
 * [UserPrime 클래스 정의]   
 * 클래스명 : UserUnique
 * + UserUnique()
 * + makeArray() : int[] 
 * + primeNumber(array : int[] ) : void
 * 
 * [문제]
 * 2~20 사이의 난수 10개를 발생시켜 배열에 저장한 후에 리턴하는 
 * makeArray() 메서드와 배열에서 소수를 구하여 출력하는 primeNumber() 메서드를 각각 구현하시오.
 * [출력결과]
<< 발생된 난수 >>
*  15 7  4  4  8  7  2  11  17  5 
<< 소수 숫자 >>
*  7 7 2 11 17 5
*  
*/

class UserPrime {
	public UserPrime() {

	}

	public int[] makeArray() {
		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 19) + 2;
		}

		return num;
	}

	public void primeNumber(int[] array) {
		System.out.println("\n<< 소수 숫자 >>");
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 2)
				System.out.print(array[i] + " ");
			else{
				for(int j = 2; j < array[i]; j++) {
					if(array[i] % j == 0)
						break;
					if(j == array[i]-1)
						System.out.print(array[i] + " ");
				}
			}
		}
	}
}

public class Prob002_random {

	public static void main(String[] args) {
		UserPrime up = new UserPrime();
		int[] num = up.makeArray();

		System.out.println("<< 발생된 난수 >>");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

		up.primeNumber(num);
	}// end main()
}// end class
