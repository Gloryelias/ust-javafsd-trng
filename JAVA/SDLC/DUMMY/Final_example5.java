package SecondWeek;


 final class Final_example5 {

	 
 public void display() {
		 System.out.println("This is a final method.");
	 }
 }
class Main1 extends Final_example5{
public void display() {
			System.out.println("The final method is overridden.");
		}
		
public static void main(String args[]) {
	Main1 obj=new Main1();
	obj.display();
}
}