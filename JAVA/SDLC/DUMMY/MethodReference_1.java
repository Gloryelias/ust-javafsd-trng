package Week4Day2;

import java.awt.List;
import java.util.ArrayList;

public class MethodReference_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList names=new ArrayList();
		
		names.add("Mahesh");
		names.add("suresh");
		
		names.forEach(System.out::println);

	}

}
