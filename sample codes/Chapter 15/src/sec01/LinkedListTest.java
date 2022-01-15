package sec01;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Double> scoreList = new LinkedList<Double>();

		scoreList.add(9.5);
		scoreList.addFirst(8.4); // ���� �� �տ� �ִ� ������ ���� �ε����� �и��� �����
		scoreList.add(9.2);
		scoreList.add(9.5);

		System.out.println(scoreList.toString());

		double maxScore = scoreList.getLast();
		double minScore = scoreList.getFirst();

		scoreList.removeFirst();
		scoreList.removeLast();

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
