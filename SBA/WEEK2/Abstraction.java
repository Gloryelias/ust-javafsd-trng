package week2_Day3;

abstract class Employee{
	
	int Eid;
	String name;
	
	abstract void calaculatesalary();
	 abstract void fethDepartment();
}
	class Engineer extends Employee
	{
	public void calaculatesalary() 
	{
	System.out.println("Engineer in calaculatesalary");
	}

	public void fethDepartment() {
		System.out.println("Doctor in fethDepartment");
	}
	
	}
	class Doctor extends Employee{
		
		public void calaculatesalary() {
			System.out.println("Doctor in calaculatesalary");
			}
			
			public void fethDepartment() {
				System.out.println("Doctor in fethDepartment");
			}
			}
	/**interface Employee1{
		class Engineer1 implements Employee1
		{
			public void calaculatesalary1() 
			{
			System.out.println("Engineer in calaculatesalary");
			}
			class Doctor1 implements Employee1
			{
				public void fethDepartment()
				{
					System.out.println("Doctor in fethDepartment");
				}
	       }
		}*/
class Abstraction{
	public static void main(String args[]) {
       Engineer e=new  Engineer();
       Doctor d=new   Doctor();
       
		e.calaculatesalary();
		e.fethDepartment();
		d.calaculatesalary();
		d.fethDepartment();
		
	}
}