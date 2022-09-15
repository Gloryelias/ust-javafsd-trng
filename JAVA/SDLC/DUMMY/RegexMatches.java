package Week3Day3;
import java.util.regex.*;
import java.util.regex.Pattern;

public class RegexMatches 
{
	private static final String REGEX="\\BCAT\\B";
	private static final String INPUT="cat cat cat cattie cat";
	
	public static void main(String[] args) 
	{
		
		Pattern p=Pattern.compile(REGEX);
		Matcher m=p.matcher(INPUT);
		
		int count=0;
		
		while(m.find()) 
		{
			count++;
			System.out.println("Match number"+count);
			System.out.println("start():"+m.start());
			System.out.println("end():"+m.end());
		}
		
	}
		
}
