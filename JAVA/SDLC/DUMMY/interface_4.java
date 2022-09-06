package Week_Day2;
class interface_4 {

	public static void main(String args[])
	{
		int a=5;
		double b=5.65;
		
		Integer aObj=Integer.valueOf(a);
		Double bObj=Double.valueOf(a);
		
		if(aObj instanceof Integer) {
			System.out.println("An Object of Integeris created.");
		}
		
		if(bObj instanceof Double) {
			System.out.println("A object of Double is created.");
		}
	}
}
