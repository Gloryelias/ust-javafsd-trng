package com.ust;

public class Test {
	static int x=1;
	private int y=3;
	public void method1(int x)
	{
		Test t= new Test();
		this.x=2;
		y=4;
		System.out.println("Test.x:"+Test.x);
		System.out.println("t.x:"+t.x);
		System.out.println("t.y:"+t.y);
		System.out.println("y:"+y);
	}
	
	public static void main(String args[])
	{
		Test t=new Test();
		t.method1(5);
	}
    }
   