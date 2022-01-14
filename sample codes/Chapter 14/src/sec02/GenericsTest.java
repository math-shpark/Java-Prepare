package sec02;

import java.util.Vector;

public class GenericsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> list = new Vector<Integer>();

		list.addElement(new Integer(100));
		list.addElement(new Integer(95));
//		list.addElement(new Double(99.6));

		int sum = 0;

		for (int i = 0; i < list.size(); i++) {
			Integer score = list.elementAt(i);
			sum = sum + score.intValue();
		}

		System.out.println("Á¡¼öÀÇ ÃÑÇÕ : " + sum);

	}

}
