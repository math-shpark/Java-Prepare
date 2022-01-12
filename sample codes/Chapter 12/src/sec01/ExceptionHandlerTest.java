package sec01;

public class ExceptionHandlerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("program start...");

		try {

			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);

			System.out.println("나누기 결과 : " + (num1 / num2));

		} catch (ArithmeticException e) {
			System.out.println("정수를 0으로 나눌 수 없다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("명령행 매개변수 2개가 필요하다.");
		}

		System.out.println("program end...");

	}

}
