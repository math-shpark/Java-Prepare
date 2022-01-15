package sec01;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��ü ����
		ArrayList<Double> scoreList = new ArrayList<Double>();

		scoreList.add(9.5);
		scoreList.add(8.4);
		scoreList.add(1, 9.2); // 1�� �ε����� 9.2�� �����Ͽ� ���� �ε����� ������ �ڷ���� ���� �ε����� �з���
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

		System.out.println("�ְ� ���� : " + maxScore);
		System.out.println("���� ���� : " + minScore);
		System.out.println("��� ���� : " + (sum / scoreList.size()));

	}

}
