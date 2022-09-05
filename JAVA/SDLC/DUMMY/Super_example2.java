package SecondWeek;

 class Animal3 {

	 //overridden method
	 Animal3() {
		 System.out.println("I am an animal");
		 
	 }
}
class Dog3 extends Animal3{
	
	Dog3(){
		
		super();
		System.out.println("I am a dog");
	}
	
}

class Super_example2{
public static void main(String[] args) {
		 Dog3 dog1=new Dog3();
		 
	 }
}








