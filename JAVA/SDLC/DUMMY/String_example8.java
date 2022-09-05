package SecondWeek;

public class String_example8 {

	public static void main(String args[]) {
		String str1="Learn java";
		String str2="java";
		String str3="java";
		
		if(str1.contains(str2)) {
			System.out.println(str1+"  contain  "+str2);
			
		}
		else {
			System.out.println(str1+"   doesn't contain  "+str2);
		}
		
		if(str1.contains(str3)) {
			System.out.println(str1+"  doesn't contain  "+str3);
		}
	}
}
