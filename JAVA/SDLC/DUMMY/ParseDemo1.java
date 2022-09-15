package Week3Day3;
import java .time.Period;
public class ParseDemo1
{
	public static void main(String[] args)
	{
		String age="P17Y9M5D";
		
		Period p=Period.parse(age);
		System.out.println("The age is: ");
		System.out.println(p.getYears()+" Year\n"+p.getMonths()+" Months\n "+p.getDays()+" Days\n");
	}

}
