package WEEK3DAY6;

import static org.junit.Assert.assertEquals;

import java.security.DomainCombiner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import wwek3day5.Connection1;

public class TestCase1 {

	@Test
	public void test()
	{
		//fail("Not yet implemented");
		assertEquals(2,2);
		assertEquals(5,Connection1.calculate(2,4));
		
	}
	public void test1() {
		assertEquals("abc","ABC");
	}
	
	@After
	public void after () 
	{
		System.out.println("In After");
	}
	@Before
	public void before()
	{
		System.out.println("In Before");
	}
	@AfterClass
	public static void afterclass()
	{
		System.out.println("In After class");
	}
	@BeforeClass
	public static void beforeclass()
	{
		System.out.println("In Before class");
	}

}
