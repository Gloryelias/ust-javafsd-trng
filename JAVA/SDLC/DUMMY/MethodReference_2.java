package Week4Day2;

public class MethodReference_2 {
	public static void ThreadStatus() {

	
		// TODO Auto-generated method stub\
		System.out.println("Thread is running....");

	}
	public static void main(String[] args)
	{
	
    Thread t2=new Thread(MethodReference_2::ThreadStatus);
}
}
