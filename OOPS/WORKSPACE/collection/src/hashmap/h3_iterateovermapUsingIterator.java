package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class h3_iterateovermapUsingIterator {

	public static void main(String[] args) {

		HashMap<Character, String> hs = new HashMap<Character, String>();

		hs.put('r', "raja");

		hs.put('z', "zebra");

		hs.put('a', "ajay");

		hs.put('n', "niraj");

		Set<Character> keyvalue = hs.keySet();

		Iterator<Character> itr = keyvalue.iterator();

		while (itr.hasNext()) {
			Character element=itr.next();
			System.out.println(hs.get(element));
//			System.out.println(hs);
//			System.out.println(keyvalue);
		}

	}
}