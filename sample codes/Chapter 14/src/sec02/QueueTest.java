package sec02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> que = new LinkedList<String>();

		for (int i = 1; i <= 3; i++) {
			que.add("������-" + i);
		}

		System.out.println("<< ���� �տ� �ִ� ��� >>");
		System.out.println(que.peek());
		System.out.println("<< ���������� ��� ������ >>");
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());

	}

}
