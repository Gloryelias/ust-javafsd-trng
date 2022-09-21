package Week4Day3;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String[] words=new String[10];
		Optional<String>checkNull=Optional.ofNullable(words[5]);
		if(checkNull.isPresent()) 
		{
			String word=words[5].toLowerCase();
			System.out.println(word);
		}
		else
			System.out.println("Word is null");
		

	}

}
