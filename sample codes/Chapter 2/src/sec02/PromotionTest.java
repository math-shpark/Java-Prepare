package sec02;

public class PromotionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b1 = 127;
		char c1 = '��';
		int i1;
		double d1;
		System.out.println("�ڵ� ����ȯ�� ���");
		i1 = b1; // 127�̶�� ���� 1byte���� 4byte�� ǥ����

		System.out.println("i1 = b1�� ����ȯ " + i1);
		i1 = c1; // '��'�� �����ڵ�� ǥ���� ������ ��(44032)�� i1�� �����

		System.out.println("i1 = c1�� ����ȯ " + i1);
		d1 = i1; // i1�� ����� 44032�� 44032.0���� 8byte �Ǽ��� ��ȯ�Ǿ� �����

		System.out.println("d1 = i1�� ����ȯ " + d1);

	}

}
