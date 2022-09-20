package Week4Day2;

interface Addable
{
	int add(int a,int b);
}
public class Lambda_3 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Addable ad1=(a,b)->(a+b);
		System.out.println(ad1.add(10,20));
		
		Addable ad2=(int a,int b)->(a+b);
		System.out.println(ad2.add(100,200));

	}

}
