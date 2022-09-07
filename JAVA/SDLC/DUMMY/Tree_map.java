package week2_Day3;

import  java.util.TreeMap;
public class Tree_map {

	public static void main(String args[]) {
		TreeMap<String,Integer>evenNumbers=new TreeMap<>();
		
		evenNumbers.put("Two",2);
		evenNumbers.put("Four",4);
		
		evenNumbers.putIfAbsent("Six", 6);
		System.out.println("TreeMapof even numbers:"+evenNumbers);
		
		TreeMap<String,Integer>number=new TreeMap<>();
		number.put("One", 1);
		
		number.putAll(evenNumbers);
		System.out.println("TreeMap of number:"+number);
		
	}
}
