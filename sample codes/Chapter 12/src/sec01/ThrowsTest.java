package sec01;

public class ThrowsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("program start... ");

		int[] scoreList = { 45, 77, 59, 88, 100 };

		try {

			double avgScore = getAvgScore(scoreList);
			System.out.println("평균 점수 : " + avgScore);

		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception

			System.out.println("평균 구할 때 문제 발생");

		}

		System.out.println("program end...");

	}

	public static double getAvgScore(int[] scoreList) throws ArrayIndexOutOfBoundsException {

		int sum = 0;

		for (int i = 0; i <= scoreList.length; i++) {

			sum = sum + scoreList[i];

		}

		return (double) sum / scoreList.length;

	}

}
