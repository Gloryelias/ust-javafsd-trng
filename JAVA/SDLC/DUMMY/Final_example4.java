package SecondWeek;

 class Final_example4 {

	 
 public final void display() {
		 System.out.println("This is a final method.");
	 }
 }
class Main extends Final_example4{
public final void display() {
			System.out.println("The final method is overridden.");
		}
		
public static void main(String args[]) {
	Main obj=new Main();
	obj.display();
}
}

