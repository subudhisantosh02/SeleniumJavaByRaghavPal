package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterDemo {
	
	
	@Test
	@Parameters("Myname")
	public void test(@Optional String name)
	{
		System.out.println("name is "+name);
	}

}
