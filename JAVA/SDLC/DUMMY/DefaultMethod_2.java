package Week4Day3;
interface Sayable
{
	default void say()
	{
		System.out.println("Hello,this is default method");
	}
	void sayMore(String msg);
}
public class DefaultMethod_2 implements Sayable
{

	public void sayMore(String msg) 
	{
		System.out.println(msg);
	}
	public static void main(String[] args) 
	{
		DefaultMethod_2 dm=new DefaultMethod_2();
		dm.say();
		dm.sayMore("Work is Worship");
		// TODO Auto-generated method stub

	}

}
