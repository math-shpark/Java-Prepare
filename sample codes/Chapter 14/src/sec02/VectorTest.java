package sec02;

import java.util.Date;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector list = new Vector(3);

		System.out.println("���� �ɷ� : " + list.capacity());
		System.out.println("���� ��� ���� : " + list.size());

		list.addElement(new Integer(10));
		list.addElement(new Double(10.0));
		list.addElement(new String("�ڹ�"));
		list.addElement(new Date());

		System.out.println("<< �� ���� ��ü ���� �� >>");
		System.out.println("���� �ɷ� : " + list.capacity());
		System.out.println("���� ��� ���� : " + list.size());

		if (list.contains("�ڹ�")) {
			System.out.print("\"�ڹ�\" ��Ʈ���� " + list.indexOf("�ڹ�"));
			System.out.println(" �� �ε����� �����Ѵ�.");
		}

		System.out.println("<< Vector�� ����� ��ҵ� >>");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "��° ��Ҵ� " + list.elementAt(i));
		}

	}

}
