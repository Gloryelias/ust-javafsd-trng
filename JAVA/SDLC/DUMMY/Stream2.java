package WEEKDAY4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		List<Integer> lst=new ArrayList<>();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		
		Stream<Integer> s=lst.stream().map(x->x+5);
		List<Integer> l=s.collect(Collectors.toList());
		System.out.println(l);
		
		
	}

}
