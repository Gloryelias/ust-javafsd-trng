package Week_Day2;

public class This_interface{
	int a;
	int b;
	
	//Default constructor
	This_interface()
	{
		this(10,20);
		System.out.println("inside default constructor \n");
	}
	
	This_interface(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Inside parameterized constructor");
		
	}
	
public static void main(String args[])
	{
	This_interface object=new This_interface();
		
	}
}


