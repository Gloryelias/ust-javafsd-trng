package Week4Day3;

import java.util.Optional;

import org.apache.poi.util.SystemOutLogger;

public class OptionalClassExample_4 {

	public static void main(String[] args) {
		Optional<String> strOption=Optional.of("Onetwothree");
		Optional<String> srOption1=strOption.map(String::toLowerCase);
				srOption1.ifPresent(System.out::println);
		// TODO Auto-generated method stub

	}

}
