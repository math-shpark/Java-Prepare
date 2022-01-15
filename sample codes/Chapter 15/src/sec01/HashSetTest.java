package sec01;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set = new HashSet<String>();

		set.add("9.5");
		set.add("8.4");
		set.add("9.2");
		set.add("9.5"); // 이미 저장된 데이터이기 때문에 무시됨
		set.add("6.7");

		System.out.println(set.toString());

		set.remove("9.2");

		System.out.println(set.toString());

	}

}
