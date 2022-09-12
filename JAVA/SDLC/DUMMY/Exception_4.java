package Week3Day1;
import java.io.FileInputStream;
import java.io.InputStream;
class Exception_4 {

	public static void main(String args[]) {
		byte[]array=new byte[100];
		
		try {
			InputStream input=new FileInputStream("input.txt");
			System.out.println("Available bytes in the file:"+input.available());
			
			input.read(array);
			System.out.println("data read fromthe file:");
			
			String data=new String(array);
			System.out.println(data);
			
			input.close();
			
			
		}
		catch(Exception e) 
	{
			e.getStackTrace();
		}
	}
}
