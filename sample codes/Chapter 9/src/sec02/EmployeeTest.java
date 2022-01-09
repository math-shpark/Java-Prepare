package sec02;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager kim = new Manager();
		kim.name = "김철수";
		kim.employeeNo = 12345;
		kim.salary = 540;
		kim.age = 46;
		kim.jobTitle = "인사팀장";
		kim.deptNo = 105;
		kim.grade = 'A';
		kim.jobOfManage = "인사 관리";
		kim.boss = "이유리";

		System.out.println("인사고과 : " + kim.grade);

	}

}
