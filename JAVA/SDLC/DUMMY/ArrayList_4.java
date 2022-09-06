package Week_Day2;

import java.util.Map;
import java.util.TreeMap;

class ArrayList_4 {
	public static void main(String args[]) {

Map<String,Integer>values=new TreeMap<>();
	
	values.put("Second",2);
	values.put("First",1);
   System.out.println("Map usingTreeMap:"+values);
   
   values.replace("First",11);
   values.replace("secongd",22);
   System.out.println("New Map:"+values);
   int removedvalues=values.remove("First");
   System.out.println("Removed Value:"+removedvalues);

}
} 

