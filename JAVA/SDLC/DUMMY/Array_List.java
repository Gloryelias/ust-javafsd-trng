package week2_Day3;
 import  java.util.Iterator;
 import java.util.ArrayList;
 
	class Array_List  {

		public static void main(String args[]) {
		ArrayList<Integer>numbers=new  ArrayList<>();
		    numbers.add(1);
			numbers.add(3);
			numbers.add(2);
			System.out.println(" ArrayList"+numbers);
			
			Iterator<Integer>iterate=numbers.iterator();
			System.out.println("Accessed Element:"+numbers);
			
			
			System.out.print("Update ArrayList:");
			
			while(iterate.hasNext()) {
				
				iterate.forEachRemaining((value)->System.out.print(value+","));;
			}
			
		}
	}


