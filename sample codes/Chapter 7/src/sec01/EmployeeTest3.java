package sec01;

public class EmployeeTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee2 kim = new Employee2();
		System.out.println("kim�� ȸ����� " + kim.companyName);

		Employee2 lee = new Employee2();
		lee.companyName = "īī��"; // Ŭ���� ���� ����
		System.out.println("lee�� ȸ����� " + lee.companyName);

		Employee2 park = new Employee2();
		System.out.println("park�� ȸ����� " + park.companyName); // ����� Ŭ���� ���� ����

	}

}
