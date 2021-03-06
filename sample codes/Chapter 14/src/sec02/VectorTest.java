package sec02;

import java.util.Date;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector list = new Vector(3);

		System.out.println("저장 능력 : " + list.capacity());
		System.out.println("저장 요소 개수 : " + list.size());

		list.addElement(new Integer(10));
		list.addElement(new Double(10.0));
		list.addElement(new String("자바"));
		list.addElement(new Date());

		System.out.println("<< 네 개의 객체 저장 후 >>");
		System.out.println("저장 능력 : " + list.capacity());
		System.out.println("저장 요소 개수 : " + list.size());

		if (list.contains("자바")) {
			System.out.print("\"자바\" 스트링은 " + list.indexOf("자바"));
			System.out.println(" 번 인덱스에 존재한다.");
		}

		System.out.println("<< Vector에 저장된 요소들 >>");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "번째 요소는 " + list.elementAt(i));
		}

	}

}
