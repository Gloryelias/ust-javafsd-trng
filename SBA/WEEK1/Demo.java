package com;

class Employee {

	int salary;
	String name;
	int age;
    int eid;
    
  int display(int salary) {
	  return salary;
  }
	  float display(float salary) {
		  return salary;
   }
  void display1() {
	    System.out.println("in parent class");
   }
}
   


class engineer extends Employee{
	    
	    void display1() {
		   super.display1();
		   System.out.println("In sub class");
	   }
   }

public class Demo{
    	
   public static void main(String args[])
   {
	Employee e=new Employee();
	engineer E=new engineer();
	System.out.println("The salary is:"+e.display(220)); 
	//Employee e1=new Employee();
	System.out.println(e.display(1000));
	System.out.println(e.display(1000f));
	E.display1();
	e.display1();
	
	
	
	    //display salary
	//System.out.println(e.display(3000));
	
   }	

}
