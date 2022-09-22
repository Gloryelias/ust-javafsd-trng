package WEEKDAY4;

import java.util.function.Predicate;

//Predicate<Integer> logic = X->X>10

public class PredicateExample_1 
{
	public static void main(String[] args) {
		Predicate<Integer>checkOddEven=x->x%2==0;
		System.out.println("Number 14 is Even "+checkOddEven.test(14));
		System.out.println("Number 18 is Even "+checkOddEven.test(18));
		System.out.println("Number 21 is Odd "+checkOddEven.test(21));
	}

}
