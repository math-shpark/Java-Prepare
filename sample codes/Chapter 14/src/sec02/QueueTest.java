package sec02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> que = new LinkedList<String>();

		for (int i = 1; i <= 3; i++) {
			que.add("데이터-" + i);
		}

		System.out.println("<< 가장 앞에 있는 요소 >>");
		System.out.println(que.peek());
		System.out.println("<< 순차적으로 요소 꺼내기 >>");
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());

	}

}
