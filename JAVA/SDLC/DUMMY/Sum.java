package com.ust;

public class Sum {
	public static void main(String args[])
	{
	//an array of numbers
		int[] numbers= {3,4,5,-5,0,12};
		int sum=0;
		
		//iterating through each element of the array
		for(int number :numbers) {
			sum+=number;
		}
		System.out.println("Sum="+sum);
	}
}

		


