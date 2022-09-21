package Week4Day3;

import java.util.Optional;

public class OptionalClassExample_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> emptyOption=Optional.empty();
		Optional<String> strOption=Optional.of("One");
		System.out.println(emptyOption.orElseGet(()->"optional null or ElseGet"));
		System.out.println(strOption.orElseGet(()->"optional value or ElseGet"));

	}

}
