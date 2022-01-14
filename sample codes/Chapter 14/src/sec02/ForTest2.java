package sec02;

import java.util.Vector;

public class ForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> subjectList = new Vector<String>();

		subjectList.add("Java");
		subjectList.add("SQL");
		subjectList.add("Servlet");

		for (String subject : subjectList) {
			System.out.println(subject);
		}

	}

}
