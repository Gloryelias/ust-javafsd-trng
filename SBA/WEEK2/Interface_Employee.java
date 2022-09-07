package week2_Day3;

interface  Employee1
{
		
	abstract void calaculatesalary1();
    abstract void fethDepartment1();
}

class Engineer1 implements Employee1
		{
			public void calaculatesalary1() 
			{
			System.out.println("Engineer in calaculatesalary");
			}
			
			public void fethDepartment1()
			{
				System.out.println("Doctor in fethDepartment");
			}
		}	
			class Doctor1 implements Employee1
			{
				public void calaculatesalary1() 
				{
				System.out.println("Engineer in calaculatesalary");
				}
			
				public void fethDepartment1()
				{
					System.out.println("Doctor in fethDepartment");
				}
	       }
class Interface_Employee{
	public static void main(String args[]) {
		     
		Engineer1 e1=new  Engineer1();
	Doctor1 d1=new  Doctor1(); 
e1.calaculatesalary1();
e1.fethDepartment1();
d1.calaculatesalary1();
d1.fethDepartment1();
}
}
