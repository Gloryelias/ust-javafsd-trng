package Week3Day3;

public class Enum_OrdinalMethod
{
	enum Position
	{
		Reema("panda"),Himanshu("Bhardwaj"),Geetanjali("Sharma");
		
		String IName;
	Position(String s)
	{
		IName=s;
	}
	String showPosition() 
	{
		return IName;
	}
	}
	public static void main(String[] args)
	
	{
		for(Position pos:Position.values()) {
			int val=pos.ordinal()+1;
			
			System.out.println("First name="+pos+"\nLast name="+pos.showPosition()+"\nPosition in class="+val);
			
			System.out.println();
		}
	}

}
