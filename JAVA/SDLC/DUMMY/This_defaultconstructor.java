package SecondWeek;

class Test_this1 {

	int val_a;
	int val_b;
	
	//Default constructor
	//Test_this1()
	{
		val_a=10;
		val_b=20;
		
	}
	Test_this1 get()
	{
		return this;
	}
	void display()
	{
		System.out.println("Val_a="+val_a+"\nval_b="+val_b);
	}
}
class This_defaultconstructor{
public static void main(String args[])
	{
		Test_this1 object=new Test_this1();
		object.get().display();
	}
}