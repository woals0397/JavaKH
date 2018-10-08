package java0913_statement;

/*
 * do{
 * 	 수행할 문장;
 * }while(조건식);
 * 
 * do~while문은 수행할 문장을 적어도 1번은 수행한다.
 */


public class Java040_do_while {
	public static void main(String[] args) {
		char chk = 'y';
		
		do {
			System.out.println("주문하시겠습니까(y/n)?");
		}while(chk == 'n');
		
		
	}
}
