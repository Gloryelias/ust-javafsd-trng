package SecondWeek;

 class Animal2 {
	protected String type="animal";
}

class Dog2 extends Animal2{
	public String type="mammal";


 public void printType() {
	 System.out.println("I am a  "   +type);
	 System.out.println("i am an  "  +super.type);
 }
 }
class Super_example1{
	public static void main(String args[]) {
		Dog2 dog1=new Dog2();
		dog1.printType();
	}
}
