package java0914_array.prob;
/*
 * num배열의 합계와 평균을 구하는 프로그램을 구현하시오.
 *  출력결과
 *  합계: 243
 *  평균:  81
 */

public class Prob_03 {

	public static void main(String[] args) {
       int num[]=new int[]{60,95,88};
       //여기를 구현하시오.
       int sum = 0;
       
       for(int i = 0; i < num.length; i++) {
    	   sum += num[i];
       }
       
       System.out.println("합계: " + sum);
       System.out.println("평균: " + sum/3);
       
	}//end main()

}//end class
