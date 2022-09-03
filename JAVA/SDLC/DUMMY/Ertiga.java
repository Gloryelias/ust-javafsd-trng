package com.ust;

class Car{
	String model;
    String colour;
    int price;
	int seats;
	String geartpye;
	
	void display()
	{
		
		System.out.println("in car class");
	}
}

class Ciaz extends Car{
  void display() {
	  System.out.println("in ciaz class");
  }
	
	void show() {
		 System.out.println("in show method");
		
	     }
}
  public class Ertiga extends Car{
		void display() {
			  System.out.println("in ciaz class");
			  super.display();		  }

  
  
  
  
  public static void main(String args[]) {
	  Ciaz C=new Ciaz();
	  
	  C.display();
	  C.show();
	  Ertiga e=new Ertiga();
	  e.display();
	  System.out.println(e.colour);
	  

	  }
}