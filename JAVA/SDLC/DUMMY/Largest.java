package com.ust;

public class Largest {
	public static void main(String args[])
	{
	
		//declaring double type variables
		
		Double n1=-1.0,n2=4.5,n3=-5.3,
				largest;
		
		//check if n1 is graeter than or equal to n2
		
		if(n1>=n2) {
			
			//if....else statement inside the if block
			//check if n1 is graeter than or equal to n3
			
			if(n1>=n3) {
				largest=n1;
			}
			
			else {
				largest =n3;
			}
		}else {
			
			//if...else statement inside else block 
			//check if n2 is greater than or equal to n3
			
			if(n2>=n3) {
				largest=n2;
			}
			
			else {
				largest =n3;
			}
		}
		System.out.println("Largest Number:"+largest);
	}
}

	
