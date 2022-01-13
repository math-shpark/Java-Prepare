package sec01;

import java.util.Objects;

public class Employee {

	private String name;
	private int number;
	private int age;
	private String title;
	private String dept;
	private String grade;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(dept, other.dept) && Objects.equals(grade, other.grade)
				&& Objects.equals(name, other.name) && number == other.number && Objects.equals(title, other.title);
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + ", age=" + age + ", title=" + title + ", dept=" + dept
				+ ", grade=" + grade + "]";
	}

}