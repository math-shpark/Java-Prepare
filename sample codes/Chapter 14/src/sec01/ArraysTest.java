package sec01;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scoreList = { 87, 56, 79, 98, 34, 55, 76 };

		Arrays.sort(scoreList); // ������ ����

		for (int i = 0; i < scoreList.length; i++) {
			System.out.print(scoreList[i] + ", ");
		}

		System.out.println("");
		System.out.println("������ : " + scoreList[0]);
		System.out.println("�ְ��� : " + scoreList[6]);

	}

}
