package SecondWeek;

interface Vehicle{
	public abstract String getcolor();
	public abstract String getengintype();
	public static final int x=4;
}
 abstract public class Interface implements Vehicle {
  public String getcolor() 
  {
	  return "Red";
  }
 /** public String getengintype()
  {
	  return "Mannual";
  }
  
}*/
}