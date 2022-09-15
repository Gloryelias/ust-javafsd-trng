package Week3Day3;
import java.util.*;

public class Enum_4 
{

	public static void main(String[] args)
	{
		
		HashSet<String>hs=new HashSet<String>();
		hs.add("P");
		hs.add("Q");
		hs.add("R");
		Enumeration e=Collections.enumeration(hs);
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
	}

}
