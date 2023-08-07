package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	
	
	//@Test(dependsOnMethods ={"test2","test3"})
	@Test(dependsOnGroups = {"Sanity1"})
	public void test1()
	{
		System.out.println("I am in test1");
	}
	
	@Test(groups= {"Sanity1"})
	public void test2()
	{
		System.out.println("I am in test2");
		//Assert.assertTrue(false);
	}
	
	@Test
	public void test3()
	{
		System.out.println("I am in test3");
		//Assert.assertTrue(false);
	}

}
