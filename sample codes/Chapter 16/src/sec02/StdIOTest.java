package sec02;

import java.io.IOException;

public class StdIOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int bt;
		int cnt = 0;

		try {
			while ((bt = System.in.read()) != -1) {
				cnt++;

				System.out.print((char) bt);
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println(e);
		}

		System.out.println();
		System.out.println("Total bytes : " + cnt);

	}

}
