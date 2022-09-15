package Week3Day4;

public class Outer1 
{
	class Inner1
	{
		void display()
		{
			System.out.println("In  Inner class.");
		}
	}
	
	public static void main(String[] args)
	{
		Inner1 i=new Outer1().new Inner1();
		i.display();
			
		}
	

}
