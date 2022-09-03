package com.ust;
class Fruit1{}
class Vehicle1{}
public class InstanceofDemo_1 {

	 public static void main(String args[])
	 {
	   Fruit apple=new Fruit();
	   Vehicle1 car=new Vehicle1();
	   
	   System.out.println("car IS A Fruit:"+(car instanceof Vehicle1));
	   
}
}