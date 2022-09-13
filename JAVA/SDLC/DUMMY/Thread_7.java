package Week3Day2;

public class Thread_7 implements Runnable{
	@Override
	public void run() {
		
	}
	public void main(String args[]) {
		Thread thread1=new Thread();
		thread1.start();
		try {
			thread1.sleep(10000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		thread1.setPriority(1);
		int priority=thread1.getPriority();
		System.out.println(priority);
		System.out.println("Thread Running");
	}

}
