package sec01;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Double> scoreList = new LinkedList<Double>();

		scoreList.add(9.5);
		scoreList.addFirst(8.4); // 원래 맨 앞에 있던 점수가 다음 인덱스로 밀리고 저장됨
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

		System.out.println("최고 점수 : " + maxScore);
		System.out.println("최저 점수 : " + minScore);
		System.out.println("평균 점수 : " + (sum / scoreList.size()));

	}

}
