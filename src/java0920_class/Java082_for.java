package java0920_class;

class Employee{
	String name;
	int salary;
	
	public Employee() {
		
	}

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void prn() {
		System.out.printf("%s %d\n", name, salary);
	}
}


public class Java082_for {
	public static void main(String[] args) {
		Employee[] emp = new Employee[2];
		emp[0] = new Employee("John", 5000);
		emp[1] = new Employee("Steven", 8000);
		
		for(int i = 0; i < emp.length; i++) {
			emp[i].prn();
		}
		
		System.out.println("=============================");
		
		for(Employee data : emp) {
			data.prn();
		}
	}
}
