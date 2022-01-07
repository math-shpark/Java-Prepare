package sec01;

public class EmployeeTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee2 kim = new Employee2();
		System.out.println("kim의 회사명은 " + kim.companyName);

		Employee2 lee = new Employee2();
		lee.companyName = "카카오"; // 클래스 변수 변경
		System.out.println("lee의 회사명은 " + lee.companyName);

		Employee2 park = new Employee2();
		System.out.println("park의 회사명은 " + park.companyName); // 변경된 클래스 변수 적용

	}

}
