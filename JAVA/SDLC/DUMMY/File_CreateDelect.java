package Week3Day1;
import java.io.File;
 class File_CreateDelect {

	 public static void main(String args[]) {
		 File file=new File("file.txt");
		 
		 boolean value=file.delete();
		 if(value) {
			 System.out.println("the File is delected.");
		 }
		 else {
			 System.out.println("The File is not delected.");
		 }
	 }
}
