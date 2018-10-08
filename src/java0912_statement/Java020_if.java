package java0912_statement;


/*
 * 다중 if~else
 * if(조건식1){
 * 	  수행할 문장1;
 * }else if(조건식2){
 * 	  수행할 문장2; 
 * }else if(조건식3){
 * 	  수행할 문장3; 
 * }else if(조건식4){
 * 	  수행할 문장4; 
 * }else{
 * 	  수행할 문장5; 
 * }
 */

public class Java020_if {

	public static void main(String[] args) {
		char code = 'B';
		
		if(code == 'A') {
			System.out.println("식품류");
		}else if(code == 'B') {
			System.out.println("육류");
		}else if(code == 'C') {
			System.out.println("야채류");
		}else {
			System.out.println("기타");
		}
		
		System.out.println("코드별 제품종류 체크");
	}

}
