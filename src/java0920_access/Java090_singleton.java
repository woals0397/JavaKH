package java0920_access;

// 싱글톤패턴(Singleton)
// - 하나의 객체만을 생성해서 처리하는 패턴

class MemberDAO{
	// 2 객체생성
	private static MemberDAO dao = new MemberDAO();
	
	// 1 생성자의 접근제어자를 private으로 선언한다.
	private MemberDAO() {
		
	}
	
	// 3 객체를 리턴해줄 메소드 정의
	public static MemberDAO getInstance() {
		return dao;
	}
	
	public void display() {
		System.out.println("display");
	}
}

public class Java090_singleton {
	public static void main(String[] args) {
		MemberDAO dp = MemberDAO.getInstance();
		dp.display();
	}
}
