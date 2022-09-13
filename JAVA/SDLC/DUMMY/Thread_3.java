package Week3Day2;

public class Thread_3 extends Thread
{
	public static void main(String[] args) 
	{
		Thread_3 t=new Thread_3();
		try
		{
		System.out.println("Hi");
		t.sleep(5000);
		System.out.println("Slept");
		}catch(Exception e)
		{
			e.getStackTrace();
		}

}
}