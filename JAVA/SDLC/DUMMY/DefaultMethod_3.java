package Week4Day3;
interface Sayable1
{
	default void say()
	{
		System.out.println("Hello,this is default method");
	}
	void sayMore(String msg);
	
	static void sayLouder(String  msg) 
	{
		System.out.println(msg);
	}
}
public class DefaultMethod_3 implements Sayable1
{

	public void sayMore(String msg) 
	{
		System.out.println(msg);
	}
	public static void main(String[] args) 
	{
		DefaultMethod_3 dm=new DefaultMethod_3();
		dm.say();
		dm.sayMore("Work is Worship");
		Sayable1.sayLouder("Hellooo....");
		// TODO Auto-generated method stub

	}

}
