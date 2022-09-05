package com;

class Test_this{

	void print()
	{
		//calling functionshow()

	this.show();
	System.out.println("Test_test::print");
	
	}
 
void show() {
	System.out.println("Test_test::show");
}
}
class This_functionshow{
	public static void main(String args[]) {
		Test_this t1=new Test_this();
		t1.print();
	}
}