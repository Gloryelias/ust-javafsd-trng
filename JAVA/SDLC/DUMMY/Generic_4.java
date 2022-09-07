package week2_Day3;

class Generic_4{
	public static void main(String args[]) {
		DemoClass demo=new DemoClass();
		
		demo.<String>genericsMethod("Java Programming");
		
		demo.<Integer>genericsMethod(25);
		
	}

}

class DemoClass{
	
	
	public <T> void genericsMethod(T data) {
		System.out.println("Generics Method.");
		System.out.println("Data Passed:"+data);
	}
}
