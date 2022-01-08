package sec02;

public class CallByReferenceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scoreList = { 40, 78, 98 };

		System.out.println("변경 전 점수 : " + scoreList[0]);

		changeScore(scoreList);

		System.out.println("변경 후 점수 : " + scoreList[0]);

	}

	private static int[] changeScore(int[] scoreList) {
		scoreList[0] = 100;

		System.out.println("변경된 점수 : " + scoreList[0]);

		return scoreList;
	}

}
