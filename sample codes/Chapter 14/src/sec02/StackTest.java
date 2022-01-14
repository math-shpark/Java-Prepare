package sec02;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> stack = new Stack<String>();

		for (int i = 1; i <= 5; i++) {
			stack.push("µ¥ÀÌÅÍ-" + i);
		}

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
