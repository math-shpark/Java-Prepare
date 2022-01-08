package sec01;

public class Employee {

	String name;
	int age;

	void setEmployee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void setEmployee(String name) {
		this.name = name;
	}

	void setEmployee() {
		name = "No Name";
		age = 0;
	}

}
