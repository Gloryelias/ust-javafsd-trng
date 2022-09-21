package Week4Day3;

import java.util.Optional;

public class OptionalClassExample_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String>str=Optional.of("One");
		System.out.println(str.orElse("defaultvalue"));
		Optional<String>str1=Optional.empty();
		System.out.println(str1.orElse("defaultvalue"));


	}

}
