package sec01;

public class ExceptionHandlerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("program start...");

		try {

			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);

			System.out.println("������ ��� : " + (num1 / num2));

		} catch (ArithmeticException e) {
			System.out.println("������ 0���� ���� �� ����.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����� �Ű����� 2���� �ʿ��ϴ�.");
		}

		System.out.println("program end...");

	}

}
