package demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Ignore
public class TestNGIgnoreDemo {
	
	//@Ignore
	@Test
	public void test1()
	{
		System.out.println("i am in test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("i am in test2");
	}
	
	

}
