package sec02;

public class VariableArgumentTest {

	public static double scoreSum(double... score) {
		double sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("���� ���� �� : " + scoreSum(80, 60, 90));
		System.out.println("���� ���� �� : " + scoreSum(100, 80, 100));

	}

}
