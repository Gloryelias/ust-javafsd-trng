package Week3Day2;

public class Thread_1  extends Thread{

public static void main(String[] args) 
{
		Thread_1 t = new Thread_1();
		t.start();
		
}	
		public void run() 
		{
			System.out.println("Thread_1");
			
		}
	}

