package sec01;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scoreList = { 98, 57, 49, 100, 99, 85, 77 };
		int maxScore = 300;
		int scoreSum = 0;

		for (int i = 0; i < scoreList.length; i++) {
			scoreSum = scoreSum + scoreList[i];

			if (scoreSum > maxScore) {
				scoreSum = scoreSum - scoreList[i]; // 누적 값이 300을 넘으면 마지막에 누적한 값을 차감한 후 반복문 종료
				break;
			}
		}

		System.out.println("scoreSum = " + scoreSum);

	}

}
