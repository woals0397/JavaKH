package Prob;

/*
 * -(private) +(public) *(protected)
 * 인터페이스명 : Design
 * makeWindow() : void
 * chooseMaterial() : void
 * 
 * 클래스명 : Building
 * -window : int
 * -material : String
 * +Building()
 * +Building(window:int, material:String)
 * +필요한 메소드 추가 구현
 * 
 * 클래스명 : House 
 * => Design인터페이스, Building클래스를 상속받음
 * name : String
 * 
 * [출력 결과]
 * 2개의 창문이 선택되었습니다.
 * 벽돌재료가 선택되었습니다.
 * 홍길동님의 집설계도가 완성되었습니다.
 * ==============================
 * 1개의 창문이 선택되었습니다.
 * 콘크리트재료가 선택되었습니다.
 * 김재민님의 집설계도가 완성되었습니다.
 */

/*
interface Design1{

}

class Building1{
	private int window;
	private String material;
	
	public Building() {
		
	}
	
	/////////////////////////////////////////////////
	
	
	
	
	
	///////////////////////////////////////////////////
}

class House {
	String name;
	
	public House() {
		
	}
	
	/////////////////////////////////////////////////////

	
	
	
	
	////////////////////////////////////////////////////////////
	
	public void prn() {
		makeWindow();
		chooseMaterial();
		System.out.println(name + "님의 집설계도가 완성되었습니다.");
	}
}

public class Pb {
	public static void main(String[] args) {
		
		House h1 = new House(2, "벽돌", "홍길동");
		h1.prn();
		
		System.out.println("==============================");
		
		House h2 = new House(1, "콘크리트", "김재민");
		h2.prn();
		
	}
}
*/