package java0928_binding.prob;
/*
 * [데이타]
 * 이름       부서     구분            급여                     수당         근무일         일당
 * 홍길동    영업부   정직원        450000      1000
 * 갑동이    기획부   계약직                                                   20     10000
 * 
 * [출력결과]
 * 홍길동  총급여  451000
 * 갑동이  총급여  200000
 * 
 * 위의 [데이타]를 참조하여 [출력결과]가 나오도록 프로그램을 구현하세요.
 */


class Person{
	String name;
	String dept;
	String offer;
	
	public Person() {
		
	}
	
	public Person(String name, String dept, String offer) {
		this.name = name;
		this.dept = dept;
		this.offer = offer;
	}
	
	int calSalary() {
		return 0;
	}
	
	public void show() {
		System.out.println(name + "  총급여  " + calSalary());
	}
}


class FullTime extends Person{
	int salary;
	int extra;
	
	public FullTime() {
	
	}
	
	public FullTime(String name, String dept, String offer, int salary, int extra) {
		super(name, dept, offer);
		this.salary = salary;
		this.extra = extra;
	}
	
	@Override
	int calSalary() {
		return salary+extra;
	}
}


class PartTime extends Person{
	int workDay;
	int wage;
	
	public PartTime() {
	
	}
	
	public PartTime(String name, String dept, String offer, int workDay, int wage) {
		super(name, dept, offer);
		this.workDay = workDay;
		this.wage = wage;
	}
	
	@Override
	int calSalary() {
		return workDay*wage;
	}
}


public class Prob003_binding {

	public static void main(String[] args) {
		Person ft = new FullTime("홍길동", "영업부", "정직원", 450000, 1000);
		ft.show();
		
		Person pt = new PartTime("갑동이", "기획부", "계약직", 20, 10000);
		pt.show();
	}//end main()

}//end class
