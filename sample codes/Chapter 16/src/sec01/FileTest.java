package sec01;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("./src/sec01/FileTest.java"); // 파일에 대한 File 객체 생성

		String fileName = file.getName(); // 생성된 파일 객체의 파일 이름 얻어냄

		if (file.exists()) {

			try {
				System.out.println(fileName);
				System.out.println(file.getPath());
				System.out.println(file.getAbsolutePath());
				System.out.println(file.getCanonicalPath());
				System.out.println(file.getParent());

				if (file.canWrite()) {
					System.out.println(fileName + "은 쓸 수 있다.");
				} else if (file.canRead()) {
					System.out.println(fileName + "은 읽을 수 있다");
				} else if (file.isFile()) {
					System.out.println(fileName + "은 파일이다.");
				} else {
					System.out.println(fileName + "은 폴더다.");
				}

				System.out.println(fileName + "의 크기 : " + file.length());

			} catch (IOException e) {
				// TODO: handle exception
				System.err.println(e);
			}

		} else {
			System.out.println("파일을 찾을 수 없다. : " + fileName);
		}

	}

}
