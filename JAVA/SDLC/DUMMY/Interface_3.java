package Week_Day2;
class Interface_3 
{
        int a;
		int b;
		
		//Default constructor
		Interface_3()
		{
			a=10;
			b=20;
			
		}
		Interface_3 get ()
		{
			return this;
		}
		void display()
		{
			System.out.println("a="+a+"\nb="+b);
		}
	
	
	public static void main(String args[])
		{
		Interface_3  object=new Interface_3 ();
			object.get().display();
		}
	}

