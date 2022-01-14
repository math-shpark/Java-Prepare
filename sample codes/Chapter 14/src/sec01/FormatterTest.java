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
		String str = "<< 연산 결과 >>";

		formatter.format("%s%n", str);
		formatter.format("%d와 %d를 더하면 %d가 됩니다. %n", i, j, k);
		formatter.format("현재 시간은 %tk시 %tM분 %tS초입니다. %n", cal, cal, cal);

		System.out.println(formatter.toString());

	}

}
