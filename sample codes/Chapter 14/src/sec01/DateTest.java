package sec01;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date currentDate = new Date();
		long start = currentDate.getTime();

		System.out.println(currentDate.toString());
		System.out.println(currentDate.toLocaleString());

		currentDate = new Date();
		long end = currentDate.getTime();

		System.out.println("���α׷� ���࿡ �ɸ� �ð� : " + (end - start) + "(ms)��");

	}

}
