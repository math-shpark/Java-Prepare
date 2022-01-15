package sec01;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Double> scoreList = new LinkedList<Double>();

		scoreList.add(new Double(9.5));
		scoreList.add(new Double(7.5));
		scoreList.add(new Double(8.2));

		System.out.println(scoreList.toString());

		double sum = 0;

		Iterator<Double> it = scoreList.iterator();

		while (it.hasNext()) {
			sum += it.next();
		}

		System.out.println("Á¡¼öÀÇ ÃÑÇÕ : " + sum);

	}

}
