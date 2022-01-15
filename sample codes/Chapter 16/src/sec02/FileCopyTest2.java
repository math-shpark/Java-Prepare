package sec02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream input = null;
		FileOutputStream output = null;

		input = new FileInputStream("./src/sec02/kakao.png");
		output = new FileOutputStream("./src/sec02/copy.png", false);

		int size = input.available();
		byte[] buff = new byte[size];
		long start = System.currentTimeMillis();

		int readCount = input.read(buff);
		output.write(buff, 0, readCount);

		long end = System.currentTimeMillis();

		System.out.println("파일 복사에 걸린 시간 : " + (end - start) + "ms(초)");

		input.close();
		output.close();

	}

}
