package com.ust;

public class Over_loading {

	int add(int a,int b) {
	  return a+b;	
	
  }
	float add(float a,int b) {
		return a+b;
	}
		
	float add(int a,float b) {

		return a+b;
	}
	
   float add(float a,float b) {
	   return a+b;
}
int add(int a,int b,int c) {
	return a+b+c;
}
public static void main(String args[]) {
	
	Over_loading O=new Over_loading();
	System.out.println(O.add(3.5f,4.5f));
	System.out.println(O.add(3,5));
	System.out.println(O.add(3,4,5));
}
}