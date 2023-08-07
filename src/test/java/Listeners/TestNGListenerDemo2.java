package Listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



//@Listeners(Listeners.TestNGListeners.class)
//its better to add listner at suite level so that it will applicable for all tests

public class TestNGListenerDemo2 {
	
	@Test
	public void test4()
	{
		System.out.println("I am inside test1");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test5()
	{
		System.out.println("I am inside test2");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test6()
	{
		System.out.println("I am inside test3");
		throw new SkipException("this test case skipped");
	}
	
	

}
