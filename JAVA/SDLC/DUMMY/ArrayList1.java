package Week_Day2;

import java.util.List;
import java.util.ArrayList;
class ArrayList1 {
	public static void main(String args[]) {
		List<Integer>numbers=new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println("List:"+numbers);
		
		int number=numbers.get(2);
		System.out.println("Accessed Element :"+number);
		
		int removedNumber=numbers.remove(1);
		System.out.println("Removes Element:"+removedNumber);
		
	}

}
