package SecondWeek;

 class Animal4 {

	 //overridden method
	 Animal4() {
		 System.out.println("I am an animal");
		 
	 }
	 Animal4(String type){
		 System.out.println("Type:"+type);
	 }
}
class Dog4 extends Animal4{
	
	Dog4(){
		super("Animals");
		System.out.println("I am a dog");
	}
	
}

class Super_example3{
public static void main(String[] args) {
		 Dog4 dog1=new Dog4();
		 
	 }
}
