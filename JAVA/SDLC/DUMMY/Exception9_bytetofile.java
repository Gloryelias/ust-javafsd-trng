package Week3Day1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Exception9_bytetofile {
       
	public static void main(String args[]) {
		
	
	String data="This is a line of text inside the file";
	try {
		FileOutputStream Output=new  FileOutputStream("input.txt");
		byte[] array=data.getBytes();
		Output.write(array);
		
		Output.close();
		
}
	 catch(Exception e) {
		 e.getStackTrace();
		 }
	}
}
