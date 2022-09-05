package SecondWeek;
abstract class lang {

	 public void display()
	 {
		 System.out.println("This is a java programming");
		 
	 }
}
 class  Abstract_lang extends lang{
	public static void main(String args[])
	{
		//System.out.println("T");
		Abstract_lang obj=new Abstract_lang();
		
		obj.display();
		
	}
}