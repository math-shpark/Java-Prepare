package sec02;

public class CallByValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 10;

		System.out.println("���� �� ���� : " + score);

		changeScore(score);
		System.out.println("���� �� ���� : " + score);

	}

	private static int changeScore(int score) {
		score = 100;

		System.out.println("����� ���� : " + score);

		return score;
	}

}
