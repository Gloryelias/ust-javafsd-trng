package Week3Day2;
//import java.lang.*;
public class Thread_9 implements Runnable
{
 public void run()
 {
	 Thread t=Thread.currentThread();
	 System.out.println("Current thread: "+t.getName());
	 
	 System.out.println(" Is Alive?"+t.isAlive());
 }

public static void main(String[] args) throws Exception {
	
	Thread t=new Thread(new Thread_9());
	t.start();
	
	t.join(1000);
	
	System.out.println("\nJoining after 1000 "+" milliseconds:\n");
	
	System.out.println("Current thread: "+t.getName());
	
	System.out.println(" Is alive?"+t.isAlive());
	
	
	
	
		// TODO Auto-generated method stub

	}

}
