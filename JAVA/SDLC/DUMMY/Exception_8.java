package Week3Day1;

 class Exception_8 
 {
  void display()
  {
	  System.out.println("Display Text");
  }
  
 }
 public class Exception2 extends Exception_8
 {
	 
	 public static void main(String args[]) 
	 {
		 Exception_8 s=new Exception_8();
		 Exception2 e=new Exception2();
		 Exception_8 e1=(Exception2) new Exception_8();
		 
	 }
 }
