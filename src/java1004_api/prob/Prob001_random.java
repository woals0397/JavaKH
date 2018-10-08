package java1004_api.prob;



/*
 * [클래스 정의]
 * 클래스명 : UserUnique
 * +UserUnique()
 * +makeArray() : int[ ]
 * +printUniqueNumber(array:int[]) : void
 * 
 * [문제]
 * 1~20 사이의 난수 10개를 발생시켜 배열에 저장한 후에 리턴하는 
 * makeArray() 메서드와 생성된 배열에서 중복된 숫자를 제거하고 
 * 유일한 숫자만 출력하는 printUniqueNumber() 메서드를 각각 구현하시오.
 * 
 * [프로그램 실행결과]
 * << 발생된 난수 >>
 *  15 7  4  4  8  7  1  11  17  5 
 *  << 중복되지 않은 유일한 숫자 >>
 *  15 8  1  11  17  5
 *  
 */

class UserUnique{
	public UserUnique() {
		
	}
	
	public int[] makeArray() {
		int[] num = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*20)+1;
		}
		
		return num;
	}
	
	public void printUniqueNumber(int[] array) {
		System.out.println("\n<< 중복되지 않은 유일한 숫자 >>");
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(array[i] == array[j] && i != j)
					break;
				if(j == array.length-1) 
					System.out.print(array[i] + " ");
			}
		}
	}
}


public class Prob001_random {

	public static void main(String[] args) {
           UserUnique uq=new UserUnique();
           int[] num= uq.makeArray();
           
           System.out.println("<< 발생된 난수 >>");
   		   for (int i = 0; i < num.length; i++) {
   			   System.out.print(num[i] + " ");
   		   }
   		   
   		   uq.printUniqueNumber(num);
   		   
	}// end main()

}// end class
