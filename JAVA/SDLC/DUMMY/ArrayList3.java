package Week_Day2;

import java.util.Map;
import java.util.HashMap;

 class ArrayList3 {
	 
	 public static void main(String args[]) {
		 Map<String,Integer>numbers=new HashMap<>();
		 
		 numbers.put("One",1);
		 numbers.put("Two",2);
		 System.out.println("Map:"+numbers);
		 
		 System.out.println("Keys:"+numbers.keySet());
		 
		 System.out.println("Values:"+numbers.values());
		 
		 System.out.println("Entries:"+numbers.entrySet());
		 
		 int value=numbers.remove("Two");
		 System.out.println("Removed Value:"+value);
		 
		}

}
