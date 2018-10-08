package java0927_abstract_interface;
/* 
 * -(private) +(public) *(protected)
 * class와 interface를 이용하여 성적처리
 * 클래스명 : User
 *  -name:String
 *  +User()
 *  +User(name:String)
 *  +toString():String
 *  
 *  인터페이스명 : Score
 *  +sol:int  (초기값:20)
 *  +getScore():int
 *  
 *  인터페이스명 : Print
 *  +toPaint():String
 *  
 *  클래스명 :UserTest에 위에서 정의한 클래스,인터페이스 상속받음
 *  [출력화면]
 *  이름 : 홍길동
 *  점수 : 60점
 */

interface Score {
	int sol = 20;
	int getScore();
}

interface Print {
	String toPaint();
}

class User {
	private String name;

	public User() {}

	public User(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

}

class UserTest extends User implements Score, Print {
	int num;

	public UserTest() {}

	public UserTest(String name, int num) {
		super(name);
		this.num = num;
	}

	@Override
	public String toPaint() {
		String res = "이름 : " + toString() + "\n점수 : " + getScore();
		return res;
	}

	@Override
	public int getScore() {
		return Score.sol*num;
	}

}

public class Java107_interface {

	public static void main(String[] args) {
		// 실행시 주석해제

		UserTest ut = new UserTest("홍길동", 3);
		System.out.println(ut.toPaint());

	}// end main( )

}// end class
