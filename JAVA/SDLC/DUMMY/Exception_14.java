package Week3Day2;
import java.io.*;
 class Exception_14
{
	
	public static  void findFile() throws IOException{
		
		File newFile=new File("test.txt");
		FileInputStream stream=new FileInputStream(newFile);
		
	}
	public static void main(String[] args) {
		try {
			findFile();
			
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	

}
