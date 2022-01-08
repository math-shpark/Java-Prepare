package sec01;

public class Employee3 {

	int employeeNo;
	String name;
	int age;
	int salary;

	public Employee3() {
		this(0, "Anonimity", 0, 0);
	}

	public Employee3(int employeeNo, String name) {
		this.employeeNo = employeeNo;
		this.name = name;
	}

	public Employee3(int employeeNo, String name, int age) {
		this(employeeNo, name);
		this.age = age;
	}

	public Employee3(int employeeNo, String name, int age, int salary) {
		this(employeeNo, name, age);
		this.salary = salary;
	}

}
