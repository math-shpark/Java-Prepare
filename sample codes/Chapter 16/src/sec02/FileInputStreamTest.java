package sec02;

import java.io.FileInputStream;

public class FileInputStreamTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int data;

		FileInputStream input = new FileInputStream("./src/sec02/FileInputStreamTest.java");

		while ((data = input.available()) > 0) { // available() �޼��带 �̿��Ͽ� �а��� �ϴ� ������ ũ�⸦ �˾ƺ�
			byte[] bytes = new byte[data]; // ������ ũ�⸸ŭ�� �迭 ��ü ����
			int result = input.read(bytes); // ������ �迭��ŭ�� ������ �о� ����

			if (result == -1) {
				break;
			}

			String str = new String(bytes); // ���� ������ ���ڿ��� ��ȯ�ؼ� ǥ�� ���

			System.out.print(str);

		}

		input.close();

	}

}
