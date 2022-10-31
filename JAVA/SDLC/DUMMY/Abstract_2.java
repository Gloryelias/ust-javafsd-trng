package SecondWeek;

/**
 * The type Animal 5.
 */
abstract class Animal5{

	/**
	 * Make sound.
	 */
	abstract void makeSound();

	/**
	 * Eat.
	 */
	public void eat() {
		System.out.println("I can eat");
	}
}

/**
 * The type Dog 5.
 */
class Dog5 extends Animal5{
	
	public void makeSound() {
		System.out.println("Bark bark bark");
		
	}
}

/**
 * The type Abstract 2.
 */
class Abstract_2{
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		Dog5 d1=new Dog5();
		
		d1.makeSound();
		d1.eat();
	}
}