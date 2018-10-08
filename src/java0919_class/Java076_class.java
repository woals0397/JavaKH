package java0919_class;

/*
 * 출력결과를 참조하여 process()메소드를 구현하시오.
 * 
 * [출력결과]
 * 10 +  5 = 15
 *  3 *  2 = 6
 */

class Calc {
	int first;
	int second;
	char ope;

	public Calc() {
	}

	public Calc(int first, int second, char ope) {
		this.first = first;
		this.second = second;
		this.ope = ope;
	}

	public int process() {
		// 여기를 구현하세요.////////////////
		int res = 0;
		
		if(ope == '+')
			res = first + second;
		else if(ope == '-')
			res = first - second;
		else if(ope == '*')
			res = first * second;
		else
			res = first / second;
		////////////////////////////////		
		return res;
	}// end process()

	public void prn() {
		System.out.printf("%2d %c %2d = %d\n", first, ope, second, process());
	}// end prn()
}// end Calc

public class Java076_class {

	public static void main(String[] args) {
		Calc[] nfo = null;
		// 여기를 구현하세요/////////////
		nfo = new Calc[2];
		nfo[0] = new Calc(10, 5, '+');
		nfo[1] = new Calc(3, 2, '*');
		/////////////////////
		display(nfo);
	}// end main( )

	public static void display(Calc[] nfo) {
		for (int i = 0; i < nfo.length; i++) {
			nfo[i].prn();
		}
	}// end display()
}// end class
