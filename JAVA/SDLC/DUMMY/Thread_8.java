package Week3Day2;
import java.lang.*;

public class Thread_8 implements Runnable
{
 Thread t;
 Thread_8(String str){
	 t=new Thread(this,str);
	 t.start();
	 
 }
	public void run() {
		for(int i=0;i<5;i++) 
		{
			
			if((i%5)==0) {
				System.out.println(Thread.currentThread().getName()+" yielding control...");
				
				Thread.yield();
				
			}
		}
		System.out.println(Thread.currentThread().getName()+" has finished executing.");
	}
	public static void main(String[] args) {
		new Thread_8("Thread1");
		new Thread_8("Thread2");
		new Thread_8("Thread3");
	}
}
