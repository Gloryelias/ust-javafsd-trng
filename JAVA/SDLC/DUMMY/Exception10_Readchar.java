package Week3Day1;
import java.io.FileReader;
import java.io.BufferedReader;
class Exception10_Readchar {

	public static void main(String args[])
	{
		char[] array=new char[100];
		
		try {
			FileReader file =new FileReader("C:\Users\ustjavafsdb218\\input.txt");
			BufferedReader input=new BufferedReader(file);
			
			input.read(array);
			System.out.println("Data in the file:");
			System.out.println(array);
			
			input.close();
			
	}

	catch(Exception e) 
{
	 e.getStackTrace();
	 }
}

