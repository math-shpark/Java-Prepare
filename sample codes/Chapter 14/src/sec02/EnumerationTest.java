package sec02;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector list = new Vector(5);

		list.addElement(new Integer(10));
		list.addElement(new Double(10.0));
		list.addElement(new String("자바"));

		System.out.println("<< Vector에 저장된 요소들 >>");

		for (int i = 0; i < list.size(); i++) {
			System.out.println("list의" + i + "번째 요소 : " + list.elementAt(i));
		}

		Enumeration e = list.elements();

		System.out.println();
		System.out.println("<< Vector로부터 생성한 Enumeration의 요소들 >>");

		while (e.hasMoreElements()) {
			System.out.println("e의 요소 : " + e.nextElement());
		}

	}

}
