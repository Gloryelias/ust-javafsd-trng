package week2_Day3;

class GenericClass<T extends Number>{

	public void display() {
		System.out.println("This is a bounded type generics class.");
	}
	
}

class Generic_5{
	public static void main(String args[]) {
		
		GenericClass<Integer>obj=new GenericClass<>();
		obj.display();
	}
}
