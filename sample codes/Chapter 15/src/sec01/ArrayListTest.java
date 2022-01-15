package sec01;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체 생성
		ArrayList<Double> scoreList = new ArrayList<Double>();

		scoreList.add(9.5);
		scoreList.add(8.4);
		scoreList.add(1, 9.2); // 1번 인덱스에 9.2로 저장하여 기존 인덱스에 저장한 자료들이 다음 인덱스로 밀려남
		scoreList.add(9.5);

		System.out.println(scoreList.toString());

		double maxScore = 0;
		double minScore = 100;
		double score = 0;

		for (int i = 0; i < scoreList.size(); i++) {
			score = scoreList.get(i);

			if (score < minScore) {
				minScore = score;
			} else if (score > maxScore) {
				maxScore = score;
			}
		}

		scoreList.remove(maxScore);
		scoreList.remove(minScore);

		System.out.println(scoreList.toString());

		double sum = 0;

		for (int i = 0; i < scoreList.size(); i++) {
			sum += scoreList.get(i);
		}

		System.out.println("최고 점수 : " + maxScore);
		System.out.println("최저 점수 : " + minScore);
		System.out.println("평균 점수 : " + (sum / scoreList.size()));

	}

}
