package Week4Day3;

import java.util.Optional;

public class OptionalClassExample 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Optional<Object> obj=Optional.ofNullable(null);
		System.out.println(obj.isPresent());
		Optional<String>strOptional=Optional.ofNullable("One");
		System.out.println(strOptional.isPresent());

	}

}
