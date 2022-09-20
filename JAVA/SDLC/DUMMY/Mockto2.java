package Week4Day1;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class Mockto2 {

	@Mock
	List<String> mocklist;
	
	
	@Before
	public void intialize() {
		MockitoAnnotations.initMocks(this); 
	}
	
	@Test
	public void test()
	{
		
		when(mocklist.get(0)).thenReturn("Glory");
		assertEquals("Glory",mocklist.get(0));
		
	}

}
