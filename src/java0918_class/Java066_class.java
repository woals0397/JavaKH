package java0918_class;

/*
 * [도서관리]
 * 제목				대출여부
 * 칼의 노래			대출중
 * 어두운 상점의 거리		대출가능
 */

/*
 * [객체 모델링]
 * 객체의 특징 : 제목, 대출여부
 * 객체의 기능 : 대출여부를 처리한다.
 */

class Book{
	String title;
	boolean state;
	
	String process() {
		if(state)
			return "대출가능";
		else
			return "대출중";
	}
}

public class Java066_class {
	public static void main(String[] args) {
		Book bk = new Book();
		bk.title = "칼의 노래";
		bk.state = false;
		
		Book bs = new Book();
		bs.title = "어두운 상점의 거리";
		bs.state = true;
		
		System.out.printf("%s, %s\n", bk.title, bk.process());
		System.out.printf("%s, %s\n", bs.title, bs.process());
	}
}
