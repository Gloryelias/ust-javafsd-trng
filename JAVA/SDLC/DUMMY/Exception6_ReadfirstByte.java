package Week3Day1;
import java.io.FileInputStream;
public class Exception6_ReadfirstByte 
{
	public static void main(String args[]) {
	
	try {
		FileInputStream input=new  FileInputStream("input.txt");
		System.out.println("Data in the file:");
		
		int i=input.read();
		
		while(i!=-1)
		{
			System.out.println((char)i);
			
			i=input.read();
			
		}
		input.close();
	
	}
	catch(Exception e) 
	{
			e.getStackTrace();
		}
}
}
