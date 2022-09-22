package WEEKDAY4;
//import java.util.*;
public class Synchronization_1 extends Thread{

	public static void main(String[] args) {
	
		Synchronization_1 t1=new Synchronization_1();
     t1.start();
     Thread t2=new Thread();
     t2.start();
	}
     public void run() 
     {
    	 
    	 synchronized(this)
    	 {
    		 System.out.println("Is Synchronized");
    	 }
    	     System.out.println("Thread is started");
    		System.gc();
    	 }
     }
     
	


