package Week4Day1;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Spy;

public class Mockito3 {

	@Test
	public void test()
	{
		List s=Mockito.spy(new ArrayList());
		s.add("Glory");
		Mockito.verify(s).add("Glory");
		
	}

}
