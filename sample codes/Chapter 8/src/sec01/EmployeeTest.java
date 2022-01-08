package sec01;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee2 kim = new Employee2();
		System.out.println(kim.name + "의 나이 : " + kim.age + ", 급여 : " + kim.salary);

		Employee2 lee = new Employee2("이유리", 45);
		System.out.println(lee.name + "의 나이 : " + lee.age + ", 급여 : " + lee.salary);

		Employee2 park = new Employee2("박지성", 28, 220);
		System.out.println(park.name + "의 나이 : " + park.age + ", 급여 : " + park.salary);

	}

}
