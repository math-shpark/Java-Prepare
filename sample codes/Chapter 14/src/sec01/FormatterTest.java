package sec01;

import java.util.Calendar;
import java.util.Formatter;

public class FormatterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer();
		Formatter formatter = new Formatter(sb);

		Calendar cal = Calendar.getInstance();

		int i = 10;
		int j = 20;
		int k = i + j;
		String str = "<< ���� ��� >>";

		formatter.format("%s%n", str);
		formatter.format("%d�� %d�� ���ϸ� %d�� �˴ϴ�. %n", i, j, k);
		formatter.format("���� �ð��� %tk�� %tM�� %tS���Դϴ�. %n", cal, cal, cal);

		System.out.println(formatter.toString());

	}

}
