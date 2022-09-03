package com.ust;
class Increment {
public static void main(String args[])
{
	byte a=126;
	
	//byte is 8 bit value
	System.out.println(a);
	
	a++;
	System.out.println(a);
	
	//It overflows here because 
	//byte can hold value from-128 to 127
	
	a++;
	System.out.println(a);
	
	//Looping back within the range
	
}

}
