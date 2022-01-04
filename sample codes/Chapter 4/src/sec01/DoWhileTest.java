package sec01;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 102;
		int sum = 0;

		do {
			if ((i % 2) == 0) {
				sum = sum + i;
			}
			++i;
		} while (i <= 100);

		System.out.println("1부터 100 사이 짝수의 합 : " + sum);

	}

}
