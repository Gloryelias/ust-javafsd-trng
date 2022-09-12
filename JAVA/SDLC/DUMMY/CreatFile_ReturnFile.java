package Week3Day1;
import java.io.File;
class CreatFile_ReturnFile {

	public static void main(String args[]) {
		File file=new File("");
		
		String[] fileList=file.list();
		for(String str:fileList)
		{
			System.out.println(str);
		}
	}
}
