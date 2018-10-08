package java0918_class;

public class Java065_class {
	
	public static void main(String[] args) {
		Person ps;	// 객체선언
		ps = new Person();	// 객체생성
		ps.name = "홍길동";
		ps.age = 30;
		ps.gen = 'M';
		
		System.out.printf("%s  %d  %c\n", ps.name, ps.age, ps.gen);
		ps.eat();
		ps.run();
		
		// 객체선언 및 생성
		Person pn = new Person();
		pn.name = "이영희";
		pn.age = 25;
		pn.gen = 'F';
		System.out.printf("%s  %d  %c\n", pn.name, pn.age, pn.gen);
		ps.eat();
		ps.run();
	}

}
