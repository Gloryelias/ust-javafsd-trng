package Week3Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffered_Examaple {
	public static void main(String args[]) {
		
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		
		try
		{
			System.out.println("Enter the age");
			String age=br.readLine();
			System.out.println(age);
			
		}
		
		catch(IOException e) {
			e.printStackTrace();
			
		}
	}

}
