package Week3Day2;

public class Thread_2 implements Runnable{
	public static void main(String[] args)
	{
		Runnable r=new Thread_2();
		r.run();
	}
	
	
	public void run() {
		System.out.println("Thread_2");
	}

}
