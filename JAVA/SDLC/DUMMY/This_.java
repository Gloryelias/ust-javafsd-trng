package SecondWeek;

 class This_construct{
	 int val1;
	 int val2;
	 
	//Default Constructor
	 This_construct()
	 {
		 this(10,20);
		 System.out.println("Default Constructor \n");
		 
	 }
	 
//Paramertized Constructor
	 This_construct(int val1,int val2)
	 {
		 this.val1=val1;
		 this.val2=val2;
		 System.out.println("Paramertized constructor");
	 }
}

 class Default{
	 public static void main(String args[]) {
		 This_construct object=new This_construct();
		 
	 }
 }