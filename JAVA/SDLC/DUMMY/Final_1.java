package com.ust;

public class Final_1 extends Super1{
     final int x=5;
     int y;
  
     
     /*void display() {
    	 System.out.println("In final");
    	 
    	 
   }*/
     
     public static void main(String args[])
 	{  Final_1 f=new Final_1();
       // s.x=7;
 	   f.y=10;
       System.out.println(f.z);
       f.display();
}


}

class Super1{
	final int z=10;
	final void display() {
		System.out.println("In Display");
	}	
	void display(int x) 
	{
		System.out.println("*");
	}
		
	
	}
