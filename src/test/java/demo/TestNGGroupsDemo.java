package demo;

import org.testng.annotations.Test;

@Test(groups= {"AllclassTests"})
public class TestNGGroupsDemo {
	
	@Test(groups= {"Sanity"})
	public void test1()
	{
		System.out.println("This is test1");
	}
	@Test(groups= {"Sanity","Smoke","Regression"})
	public void test2()
	{
		System.out.println("This is test2");
	}
	@Test(groups= {"Smoke","Regression"})
	public void test3()
	{
		System.out.println("This is test3");
	}
	@Test(groups= {"Regression"})
	public void test4()
	{
		System.out.println("This is test4");
	}
	@Test
	public void test5()
	{
		System.out.println("This is test5");
	}
	

}
