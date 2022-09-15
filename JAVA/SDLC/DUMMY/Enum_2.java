package Week3Day3;

 enum Size1{

	 SMALL,MEDIUM,LARGE,EXTRALARGE
}

class Test{
	Size1 pizzaSize;
	public Test(Size1 pizzaSize) {
	this.pizzaSize=pizzaSize;
	
}
public void orderPizza() {
	switch(pizzaSize) {
	case SMALL:
		System.out.println("I ordered a medium size pizza");
		break;
		default:
			System.out.println("I don't know which one to order.");
			break;
	}
	}
}
class Enum_2{
	public static void main(String args[]){
		Test t1=new Test(Size1.MEDIUM);
		t1.orderPizza();
	}
}