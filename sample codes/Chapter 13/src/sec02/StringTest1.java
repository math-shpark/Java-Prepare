package sec02;

public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String companyName1 = new String("�ڹ�"); // "�ڹ�" ���ڿ� ��ü ����
		String companyName2 = companyName1.concat("��Ʈ"); // companyName1 ���ڿ� �ڿ� "��Ʈ" ����

		System.out.println(companyName1);
		System.out.println(companyName2);

	}

}