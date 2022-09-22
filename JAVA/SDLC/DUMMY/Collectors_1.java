package WEEKDAY4;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Collectors_1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		List<String> names=Array.asList("Jon","Ajeet","Steve","Ajeet","Jon","Ajeet");
			
				Map<String,Long>map=names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
				
		System.out.println(map);
	}

}
