package Week4Day2;
import java.util.List;
import java.util.ArrayList;

//import com.sun.tools.javac.util.List;

public class Lambda_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		
		list.add("anika ");
		list.add("mayank ");
		list.add("irfan ");
		list.forEach((n)->System.out.println(n));

	}

}
