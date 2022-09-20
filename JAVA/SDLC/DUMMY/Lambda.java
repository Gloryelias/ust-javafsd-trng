package Week4Day2;
import java.lang.FunctionalInterface;

@FunctionalInterface
interface MyInterface{
	
	double getPiValue();
}
public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface ref;
		
		ref=()->3.1415;
		System.out.println("Value of Pi="+ref.getPiValue());

	}

}
