package sec01;

import java.io.File;

public class DirTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File dir = new File("./src/sec01");

		if (dir.isDirectory()) {
			String[] fileList = dir.list();

			for (int i = 0; i < fileList.length; i++) {
				System.out.println(fileList[i]);
			}
		} else {
			System.out.println("File 객체는 폴더가 아니다.");
		}

	}

}
