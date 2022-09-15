package Week3Day3;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonReader
{
	public static void main(String[] args) 
	{
		JSONParser p=new JSONParser();
		try 
		{
			
		
        Object o=p.parse(new FileReader("C:\\Users\\ustjavafsdb218\\Downloads\\Student.json"));
		JSONObject obj=(JSONObject) o;
		String name=(String)obj.get("name");
		long age=(long)obj.get("age");
		System.out.println(name+"\n"+age);
		
		}	
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
