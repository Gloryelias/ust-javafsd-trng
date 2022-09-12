package Week3Day1;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
public class Exception13_writedata 
{
      
		public static void main(String args[]) {
			
		
		String data="This is a line of text inside the file";
		try {
			FileOutputStream file=new  FileOutputStream("output.txt");
			
			BufferedOutputStream Output=new BufferedOutputStream(file);
			byte[] array=data.getBytes();
			Output.write(array);
			
			Output.close();
			
	
}
catch(Exception e) 
{
 e.getStackTrace();
 }
}
}