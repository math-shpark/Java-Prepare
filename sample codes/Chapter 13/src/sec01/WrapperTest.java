package sec01;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean b1 = new Boolean("TRUE"); // ��ҹ��ڸ� �������� �ʰ� true��� �Ű������� ��� true��� ���
		Boolean b2 = new Boolean("????"); // true �� ���ڿ��� ��� false

		Integer i1 = new Integer(10); // ���� Ŭ����
		Integer i2 = new Integer(10);

		Double d = new Double(10.0); // �Ǽ� Ŭ����

		System.out.println("Boolean ��ü : " + b1); // ������ �� ��ü���� ����Ͽ� �� Ȯ��
		System.out.println("Boolean ��ü : " + b2);
		System.out.println("Integer ��ü : " + i1);
		System.out.println("double ��ü : " + d);

		System.out.println("int�� �ִ밪 : " + Integer.MAX_VALUE);
		System.out.println("int�� �ּҰ� : " + Integer.MIN_VALUE);

		if (i1.equals(i2))
			System.out.println("����");

		System.out.println("a ���ڰ� �빮���ΰ� : " + Character.isUpperCase('a'));
		System.out.println("-1�� ������ : " + Integer.toBinaryString(-1));
		System.out.println("String 3.14�� �Ǽ��� ��ȯ : " + Double.parseDouble("3.14"));

	}

}