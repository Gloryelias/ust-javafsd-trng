package Week4Day2;

interface Sayable1{
	void say();
}
public class MethodReference_3 {
	public static void saySomething()
	{
       System.out.println("Hello,this is static method.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sayable1 sayable=MethodReference_3::saySomething;
		sayable.say();
	}

}
