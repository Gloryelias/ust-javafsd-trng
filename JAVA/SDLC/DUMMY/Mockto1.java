package Week4Day1;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class Mockto1 {

	@Test
	public void test()
	{
		//fail("Not yet implemented");
		System.out.println("In Test Method");
		List<String> mockList=mock(List.class);
		when(mockList.size()).thenReturn(5);
		assertTrue(mockList.size()==5);
		System.out.println("End of Test Method");
	}

}
