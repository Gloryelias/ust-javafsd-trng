package WEEKDAY4;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.poi.util.SystemOutLogger;
public class Sream_3 {

	public static void main(String[] args) {
		
		List<String>lines=Arrays.asList("Walnut","Apricot","Almond");
		List<String>result=lines.stream().filter(line->!"almond".equals(line)).collect(Collectors.toList());
		result.forEach(System.out::println);
		// TODO Auto-generated method stub

	}

}
