package sec01;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> set = new LinkedHashSet<String>();

		set.add("9.5");
		set.add("8.4");
		set.add("9.2");
		set.add("9.5");
		set.add("6.7");

		System.out.println(set.toString());

		set.remove("9.2");
		System.out.println(set.toString());

	}

}
