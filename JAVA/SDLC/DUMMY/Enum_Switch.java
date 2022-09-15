package Week3Day3;

 enum Size3{
	 SMALL,MEDIUM,LARGE,EXTRALARGE;
	 public String getSize() 
	 {
		 
		 switch(this)
		 {
		 case SMALL:
		  return"small";
		 
		 case MEDIUM:
			 return"medium";
			 
		 case LARGE:
		  return "large";
		 
		 case EXTRALARGE:
		  return "extra large";
		 
		 default:
			 return null;
			 
		 }
	 }
 }
	 
class Enum_Switch
{
	public static void main(String args[]) 
	{
		System.out.println("The Size of the pizza is "+Size3.MEDIUM.getSize());
	}
}

