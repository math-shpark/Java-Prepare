package sec02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream input = null;
		FileOutputStream output = null;

		input = new FileInputStream("./src/sec02/kakao.png");
		output = new FileOutputStream("./src/sec02/copy.png", false);

		long start = System.currentTimeMillis();
		int ch = 0;

		while ((ch = input.read()) != -1) {
			output.write(ch);
		}

		long end = System.currentTimeMillis();

		System.out.println("파일 복사에 걸린 시간 : " + (end - start) + "ms(초)");

		input.close();
		output.close();

	}

}
