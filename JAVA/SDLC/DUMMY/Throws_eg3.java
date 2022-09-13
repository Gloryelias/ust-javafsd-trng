package Week3Day2;
import java.io.RandomAccessFile;

class Throws_eg3 
{

	static void fun() throws IllegalAccessException
	{
		System.out.println("Inside fun().");
		throw new IllegalAccessException("demo");
		
	}
	public static void main(String args[])
	{
		try
		{
			fun();
			
		}
		catch(IllegalAccessException e)
		{
			System.out.println("caught in main.");
		}
	}
}
