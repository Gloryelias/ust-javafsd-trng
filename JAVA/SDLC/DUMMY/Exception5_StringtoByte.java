package Week3Day1;
import java.io.FileOutputStream;
import java.io.OutputStream;
class Exception5_StringtoByte {
	public static void main(String args[]) {
		String data="This is a line of text insidethe file";
		
		try {
			OutputStream out=new FileOutputStream("output.txt");
			
			byte[]dataBytes=data.getBytes();
			
			out.write(dataBytes);
			System.out.println("Data is writtern to the file");
			
			out.close();
			
			}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
