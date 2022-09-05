package SecondWeek;
abstract class Animal5{
	
	abstract void makeSound();
	
	public void eat() {
		System.out.println("I can eat");
	}
}
class Dog5 extends Animal5{
	
	public void makeSound() {
		System.out.println("Bark bark");
		
	}
}
class Abstract_2{
	public static void main(String[] args) {
		Dog5 d1=new Dog5();
		
		d1.makeSound();
		d1.eat();
	}
}