package sec01;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("./src/sec01/FileTest.java"); // ���Ͽ� ���� File ��ü ����

		String fileName = file.getName(); // ������ ���� ��ü�� ���� �̸� ��

		if (file.exists()) {

			try {
				System.out.println(fileName);
				System.out.println(file.getPath());
				System.out.println(file.getAbsolutePath());
				System.out.println(file.getCanonicalPath());
				System.out.println(file.getParent());

				if (file.canWrite()) {
					System.out.println(fileName + "�� �� �� �ִ�.");
				} else if (file.canRead()) {
					System.out.println(fileName + "�� ���� �� �ִ�");
				} else if (file.isFile()) {
					System.out.println(fileName + "�� �����̴�.");
				} else {
					System.out.println(fileName + "�� ������.");
				}

				System.out.println(fileName + "�� ũ�� : " + file.length());

			} catch (IOException e) {
				// TODO: handle exception
				System.err.println(e);
			}

		} else {
			System.out.println("������ ã�� �� ����. : " + fileName);
		}

	}

}
