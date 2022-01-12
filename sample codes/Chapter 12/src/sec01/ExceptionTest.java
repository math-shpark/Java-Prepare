package sec01;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("program start...");

		try {

			int num1 = 9;
			int num2 = 0;

			System.out.println("나누기 결과 : " + (num1 / num2));

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println("정수를 0으로 나눌 수 없습니다.");

		}

		System.out.println("program end...");

	}

}
