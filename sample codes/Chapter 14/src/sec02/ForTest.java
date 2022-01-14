package sec02;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scoreList = { 50, 45, 99, 85, 100 };
		int scoreSum = 0;

		for (int score : scoreList) {
			scoreSum = scoreSum + score;
		}

		System.out.println("Á¡¼öÀÇ ÃÑÇÕ : " + scoreSum);

	}

}
