import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import java.util.List;
public class Mockito1 
{

	@Test
	
	public void test() {
		
		//fail("Not yet implemented");
		List<String> lst=new ArrayList<>();
		List<String> s=spy(lst);
		when(s.size()).thenReturn(5);
		assertEquals(5,s.size());
		//Mockito.verify(s).add
	}
	

}
