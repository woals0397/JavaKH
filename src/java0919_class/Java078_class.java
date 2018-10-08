package java0919_class;

/*
 * [출력결과]
 * 기업은행 42523-52325 100000
 * 하나은행 52253-22623 153000
 * 신한은행 16239-95235 256000
 * 총납입액:509000
 */
class CreditCard {
	String cardName;
	String cardNum;
	int pay;

	public CreditCard() {
	}

	public CreditCard(String cardName, String cardNum, int pay) {
		super();
		this.cardName = cardName;
		this.cardNum = cardNum;
		this.pay = pay;
	}

	public void prn() {
		System.out.printf("%s %s %d\n", cardName, cardNum, pay);
	}

}// end CreditCard

public class Java078_class {

	public static void main(String[] args) {
		/// [출력결과]를 참조하여 구현하시요/////////////////
		CreditCard[] card = new CreditCard[3];
		card[0] = new CreditCard("기업은행", "42523-52325", 100000);
		card[1] = new CreditCard("하나은행", "52253-22623", 153000);
		card[2] = new CreditCard("신한은행", "16239-95235", 256000);
		
		process(card);
	}// end main()

	public static void process(CreditCard[] card) {
		int sum = 0; 
		
		for(int i = 0; i < card.length; i++) {
			card[i].prn();
			sum += card[i].pay;
		}
		
		System.out.println("총납입액:" + sum);
	}
	
}// end class






