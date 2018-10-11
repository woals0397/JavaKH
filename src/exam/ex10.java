package exam;

interface Bonus{
	public void incentive(int pay);
}

abstract class Employee{
	private String name;
	private int number;
	private String department;
	private int salary;
	
	public Employee() {
	
	}
	
	public Employee(String name, int number, String department, int salary) {
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}
	
	public double tax() {
		return 0.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}

class Secretary extends Employee implements Bonus{
	public Secretary() {
	
	}
	
	public Secretary(String name, int number, String department, int salary) {
		super(name, number,department, salary);
	}
	
	@Override
	public double tax() {
		return getSalary()*0.1;
	}
	
	@Override
	public void incentive(int pay) {
		setSalary(getSalary() + (int)(pay*0.8));
	}
}

class Sales extends Employee implements Bonus{
	public Sales() {
		
	}
	
	public Sales(String name, int number, String department, int salary) {
		super(name, number,department, salary);
	}
	
	@Override
	public double tax() {
		return getSalary()*0.13;
	}
	
	@Override
	public void incentive(int pay) {
		setSalary(getSalary() + (int)(pay*1.2));
	}
}

public class ex10 {
	public static void main(String[] args) {
		Employee[] employees = new Employee[2];
		employees[0] = new Secretary("Hilery", 1, "secretary", 800);
		employees[1] = new Sales("Clinten", 2, "sales", 1200);
		
		System.out.println("name      department     salary");
		System.out.println("---------------------------------");
		for(int i = 0; i < employees.length; i++) {
			System.out.printf("%s     %s      %d\n", employees[i].getName(), employees[i].getDepartment(), employees[i].getSalary());
		}
		
		((Secretary) employees[0]).incentive(100);
		((Sales) employees[1]).incentive(100);
		
		System.out.println("\n인센티브 100 지급");
		System.out.println("name      department     salary    tax");
		System.out.println("-----------------------------------------");
		for(int i = 0; i < employees.length; i++) {
			System.out.printf("%s     %s      %d     %.1f\n", employees[i].getName(), employees[i].getDepartment(), employees[i].getSalary(), employees[i].tax());
		}
	}
}
