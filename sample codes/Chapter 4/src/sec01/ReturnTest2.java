package sec01;

public class ReturnTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scoreList = { 34, 56, 21, 73, 5, 17, 98 };
		double avgScore = calcAvg(scoreList);

		System.out.println("평균 점수 : " + avgScore);

	}

	private static double calcAvg(int[] scoreList) {
		int sum = 0;

		for (int i = 0; i < scoreList.length; i++) {
			sum = sum + scoreList[i];
		}

		return (double) sum / scoreList.length; // 계산된 평균 점수를 리턴
	}

}
