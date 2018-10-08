package java0921_inheritance.prob;

/*
 [주의]테스트를 할때 main( )메소드의 주석을 해제하세요.
 
 [main메소드와 ClassTest_1은 수정하지 마세요] 
 1 ClassTest_1을 상속받아 ClassTest_2 클래스를 정의한다.
 2 하위클래스에 String department 변수를 선언한다.
 3 하위클래스를 객체생성시 인수값 3개를 넘겨준다(이름, 연봉, 부서)
      
 4  아래와 같이 출력되도록 상위클래스  getInformation()메소드를 오버라이딩한다. 
 이름:이지나  연봉:3000  부서:교육부

 5 하위클래스에 prn()메소드 오버라이딩
 => "서브클래스"문자열 출력
 
 6 하위클래스에 callSuperThis()메소드 정의 
 상위의 prn()메소드와 하위의 prn()메소드 호출


 
 [출력결과]
 수퍼클래스
 서브클래스
 이름:이지나  연봉:3000  부서:교육부
 */



class ClassTest_1 {
	private String name;
	private int salary;
	
	public ClassTest_1() {
		
	}

	ClassTest_1(String n, int s) {
		name = n;
		salary = s;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}

	public void getInformation() {
		System.out.println("이름:" + name + " 연봉:" + salary);
	}

	public void prn() {
		System.out.println("수퍼클래스");
	}
} // end ClassTest_1


//여기에  ClassTest_2클래스를 구현하세요.///////
class ClassTest_2 extends ClassTest_1{
	String department;
	
	public ClassTest_2(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	@Override
	public void getInformation() {
		System.out.println("이름:" + this.getName() + " 연봉:" + this.getSalary() + " 부서:" + this.department);
	}
	
	@Override
	public void prn() {
		System.out.println("서브클래스");
	}
	
	public void callSuperThis() {
		super.prn();
		this.prn();
	}
}
///////////////////////////////////////////////////

public class Prob01_inheritance {

	public static void main(String[] args) {
		//테스트를 할때는 아래 주석을 해제하세요.
		
		ClassTest_2 ct=new ClassTest_2("이지나",3000,"교육부");
		ct.callSuperThis();
		ct.getInformation();
		
	}// end main()

}// end class
