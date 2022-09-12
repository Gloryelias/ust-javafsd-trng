package Week3Day1;

public class Arithmetic_Exception {
	public static void main(String args[]) {
		try {
		int divideByZero=5/0;
		System.out.println("rest of code in try block");
		
	}

	catch(ArithmeticException e) {
		System.out.println("ArithmeticException=>" +e.getMessage());
	}
}
}