package java1002_api;
/*
 * data변수에 저장된 값이 아래와 같이 출력이 되도록 process메소드를
 * 구현하시오.
 * [출력결과]
   java
   jsp
   spring
 */

public class Java127_RegEx {

	public static void main(String[] args) {
		String data="java/jsp:spring";
        process(data);
	}//end main()
	
	public static void process(String data) {
		//여기에  구현하시오.
		System.out.println(data.replaceAll("[/:]", "\n"));
		
	}//end process()

}//end class









