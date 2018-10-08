package java0918_class;
/*
 * 메뉴명	    가격	   갯수
 * 떡볶이	  2000	  3
 * 김말이	   500	  2
 * 오뎅	   300	  4
 */

/*
[출력결과]
메뉴명:떡볶이
가격:2000
갯수:3
메뉴금액:6000

메뉴명:김말이
가격:500
갯수:2
메뉴금액:1000

메뉴명:오뎅
가격:300
갯수:4
메뉴금액:1200
============
총금액:8200
 */

class MenuShop {
	String menu; // 메뉴명
	int price; // 가격
	int cnt; // 갯수

	// 주문메뉴 계산
	int count() {
		return price * cnt;
	}
	
	public void prn() {
		System.out.printf("메뉴명:%s\n", menu);
		System.out.printf("가격:%d\n" , price);
		System.out.printf("갯수:%d\n" , cnt);
		System.out.printf("메뉴금액:%d\n\n" , count());
	}// end main()
	
}// end MenuShop


public class Java068_class {

	public static void main(String[] args) {
		MenuShop m1 = new MenuShop();
		m1.menu = "떡볶이";
		m1.price = 2000;
		m1.cnt = 3;
		m1.prn();
		
		MenuShop m2 = new MenuShop();
		m2.menu = "김말이";
		m2.price = 500;
		m2.cnt = 2;
		m2.prn();
		
		MenuShop m3 = new MenuShop();
		m3.menu = "오뎅";
		m3.price = 300;
		m3.cnt = 4;
		m3.prn();
		
		System.out.println("==============");
		System.out.println("총금액 :" +(m1.count() + m2.count() + m3.count()));
	}

}
