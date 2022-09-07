package week2_Day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Map3 {
	public static void main(String args[]) {
		Map<Integer,String> m =new HashMap<>();
		m.put(1, "S");
		m.put(2, "F");
		m.put(3, "A");
		
		Set keys= m.keySet();
	//	Set Values=m.valueSet();
		System.out.println("Keys:"+keys);
		//System.out.println(Values);
	}

}
