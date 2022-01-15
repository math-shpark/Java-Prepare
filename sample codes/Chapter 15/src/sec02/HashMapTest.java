package sec02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("±èÃ¶¼ö", "010-123-1111");
		map.put("ÀÌÀ¯¸®", "010-123-1234");
		map.put("¹ÚÁö¼º", "010-333-3333");

		Set<String> keys = map.keySet();

		System.out.println(keys.toString());

		Iterator<String> it = keys.iterator();

		while (it.hasNext()) {
			String key = (String) it.next();

			System.out.println(key + " : " + map.get(key));
		}

	}

}
