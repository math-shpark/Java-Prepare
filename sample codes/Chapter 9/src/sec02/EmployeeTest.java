package sec02;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager kim = new Manager();
		kim.name = "��ö��";
		kim.employeeNo = 12345;
		kim.salary = 540;
		kim.age = 46;
		kim.jobTitle = "�λ�����";
		kim.deptNo = 105;
		kim.grade = 'A';
		kim.jobOfManage = "�λ� ����";
		kim.boss = "������";

		System.out.println("�λ��� : " + kim.grade);

	}

}
