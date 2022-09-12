package Week3Day1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_example {
	public static void main(String args[]) {
		
	
	
	File f=new File("C:\\Users\\ustjavafsdb218\\ABC.txt");
	//FileOutputStream fstm=new FileOutputStream(f)
	
	try {
		FileOutputStream fstm=new FileOutputStream(f);
		byte [] b="This I am writing to file".getBytes();
	
		if(f.createNewFile())
		{
			System.out.println("New File Created.");
			fstm.write(b);
		}
		else
		{
			System.out.println("File exits.");
			fstm.write(b);
		}
	}

catch(IOException e) {
	e.printStackTrace();
}
}
}