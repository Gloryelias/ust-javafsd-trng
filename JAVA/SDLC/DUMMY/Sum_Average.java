package com.ust;

public class Sum_Average {
	public static void main(String srgs[]) {
		int[] numbers= {2,-9,0,5,12,-25,22,9,8,12};
		int sum=0;
		Double average;
		
		
		for(int number:numbers) {
			sum+=number;
		}
		
		int arrayLength=numbers.length;
		
		average=((double)sum/(double)arrayLength);
		
		System.out.println("Sum="+sum);
		System.out.println("Average="+average);
		
		}
	}


