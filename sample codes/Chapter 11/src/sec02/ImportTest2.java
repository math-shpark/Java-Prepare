package sec02;

import java.sql.Date;

public class ImportTest2 {

	public static void main(String args[]) {

		java.util.Date utilDate = new java.util.Date();
		System.out.println("util Date : " + utilDate.toString());

		Date sqlDate = new Date(System.currentTimeMillis());
		System.out.println("sql Date : " + sqlDate.toString());

	}

}
