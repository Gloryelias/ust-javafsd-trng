package Week3Day2;
 class Throw_Eg2 
{

	static void fun()
	{
		try
		{
			throw new NullPointerException("demo");
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught inside fun().");
			throw e;
		}
	}
	public static void main(String args[]) {
		try
		{
			fun();
			
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught in main.");
		}
	}
}
