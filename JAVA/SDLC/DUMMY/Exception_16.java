package Week3Day2;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
class Exception_16 
{
  public static void main(String args[]) {
	  String line;
	  try(BufferedReader br=new BufferedReader(new FileReader("test.txt"))){
		  
		  
			while((line=br.readLine())!=null)
			{
				System.out.println("Line=>"+line);
			}
  }
	  catch(IOException e) {
		  System.out.println("IOEception in try block=>"+e.getMessage());
		  
	  }
  }
	
}
