package java0912_statement;

public class Java027_switch {

	public static void main(String[] args) {
		char code = 'B';

		/*if (code == 'A') {
			System.out.println("식품류");
		} else if (code == 'B') {
			System.out.println("육류");
		} else if (code == 'C') {
			System.out.println("야채류");
		} else {
			System.out.println("기타");
		}*/
		
		switch(code){
			case 'A' : System.out.println("식품류"); break;
			case 'B' : System.out.println("육류"); break;
			case 'C' : System.out.println("야채류"); break;
			default : System.out.println("기타");
		}

		System.out.println("코드별 제품종류 체크");

	}

}
