package sec01;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee2 kim = new Employee2();
		System.out.println(kim.name + "�� ���� : " + kim.age + ", �޿� : " + kim.salary);

		Employee2 lee = new Employee2("������", 45);
		System.out.println(lee.name + "�� ���� : " + lee.age + ", �޿� : " + lee.salary);

		Employee2 park = new Employee2("������", 28, 220);
		System.out.println(park.name + "�� ���� : " + park.age + ", �޿� : " + park.salary);

	}

}
