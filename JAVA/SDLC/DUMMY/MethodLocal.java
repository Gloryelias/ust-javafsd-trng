package Week3Day4;

public class MethodLocal
{
	void display() 
	{
		int x=5;
		System.out.println("X:"+x);
		
		class MethodInner
		{
			void display1() 
			{
				System.out.println("In Method Local");
			}
		}
		MethodInner i=new MethodInner();
		i.display1();
	}//Method Ends

public static void main(String[] args)
{
	MethodLocal m=new MethodLocal();
	m.display();
	System.out.println("Calling outer class");
}
}
