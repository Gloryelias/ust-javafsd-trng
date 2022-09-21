package Week4Day3;

public class Static_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new car();
		v.print();
		

	}

}
interface Vehicle{
	default void print() {
		System.out.println("I am a vehicle!");
		
	}
	static void blowHorn() {
		System.out.println("Blowing horn!!!");
	}
}
interface FourWheeler{
	default void print() {
		System.out.println("I am a four Wheeler!");
	}
}
class car implements Vehicle,FourWheeler{
	public void print()
	{
		Vehicle.super.print();
		FourWheeler.super.print();
		Vehicle.blowHorn();
		System.out.println("I am a car");
	}
}
