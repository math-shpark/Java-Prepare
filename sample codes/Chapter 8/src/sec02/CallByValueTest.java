package sec02;

public class CallByValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 10;

		System.out.println("변경 전 점수 : " + score);

		changeScore(score);
		System.out.println("변경 후 점수 : " + score);

	}

	private static int changeScore(int score) {
		score = 100;

		System.out.println("변경된 점수 : " + score);

		return score;
	}

}
