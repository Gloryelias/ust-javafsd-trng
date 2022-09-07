package week2_Day3;

import java.util.Collection;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public class Map2 {

	public static void main(String args[]) {
		Map<Integer,Float> m =new HashMap<>();
		m.put(1, 3.4f);
		m.put(2, 3.22f);
		m.put(3, 44.5f);
		
		Collection c=m.values();
		Iterator itr=c.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
}
