package Week3Day1;
 class Throw_Eg {

	 public double calculate(int a,int b)throws Exception
	 {
		 //throw new Exception()
		 return(a+b);
	 }
		 void display(int x) throws Exception
		 {
			 if(x==5)throw new Exception ();
		 }
	 
	
 public static void main(String args[]) 
	 {
	 Exception3 e=new Exception3();
	 try
	 {
	 e.calculate(5,6);
	 e.display(5);
	 }
	 catch(Exception f) {
		 f.getStackTrace();
	 }
}
}