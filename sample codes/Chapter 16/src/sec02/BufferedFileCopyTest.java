package sec02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedFileCopyTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream input = null;
		BufferedInputStream buffInput = null;
		FileOutputStream output = null;
		BufferedOutputStream buffOutput = null;

		input = new FileInputStream("./src/sec02/kakao.png");
		buffInput = new BufferedInputStream(input);
		output = new FileOutputStream("./src/sec02/copy.png");
		buffOutput = new BufferedOutputStream(output);

		long start = System.currentTimeMillis();
		int ch = 0;

		while ((ch = buffInput.read()) != -1) {
			buffOutput.write(ch);
		}

		long end = System.currentTimeMillis();

		buffInput.close();
		input.close();
		buffOutput.close();
		output.close();

		System.out.println("파일 복사에 걸린 시간 : " + (end - start) + "ms(초)");

	}

}
