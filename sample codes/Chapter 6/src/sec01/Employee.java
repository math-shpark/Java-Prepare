package sec01;

public class Employee {
	
	private String name; // �̸�
	private int number; // ���
	private String dept; // �ٹ� �μ�
	
	// ������
	public Employee(String name, int number, String dept) {
		this.name = name;
		this.number = number;
		this.dept = dept;
	}

	// �޼���
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
