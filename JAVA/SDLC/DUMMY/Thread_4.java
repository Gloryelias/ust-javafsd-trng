package Week3Day2;

public class Thread_4 implements Runnable{
	
		
	
public void run() {
		System.out.println("Doing heavy processing-STRAT"+Thread.currentThread().getName());
	
		try
		{
			Thread.sleep(1000);
			
			doDBProcessing();
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Doing heavy processing-END"+Thread.currentThread().getName());
	}
	
    private void doDBProcessing()throws InterruptedException{
    	Thread.sleep(5000);
    }
}


