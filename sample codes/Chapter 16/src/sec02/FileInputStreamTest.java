package sec02;

import java.io.FileInputStream;

public class FileInputStreamTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int data;

		FileInputStream input = new FileInputStream("./src/sec02/FileInputStreamTest.java");

		while ((data = input.available()) > 0) { // available() 메서드를 이용하여 읽고자 하는 파일의 크기를 알아봄
			byte[] bytes = new byte[data]; // 파일의 크기만큼의 배열 객체 생성
			int result = input.read(bytes); // 생성된 배열만큼의 데이터 읽어 들임

			if (result == -1) {
				break;
			}

			String str = new String(bytes); // 읽은 내용을 문자열로 변환해서 표준 출력

			System.out.print(str);

		}

		input.close();

	}

}
