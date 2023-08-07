package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {
	
	static WebDriver driver=null;
	
	@Parameters("browserName")
	@BeforeTest
		public void setup(String browserName) {
		
		System.out.println(browserName);
		System.out.println("Thread id:- "+Thread.currentThread().getId());
		
		if (browserName.equalsIgnoreCase("chrome"))
		{
		driver=new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}else
		{
			driver=new EdgeDriver();
		}
		
	}
	
	@Test
	public void test1() throws InterruptedException
	{
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
	}
	
	@AfterTest
public void teardown()
{
	driver.quit();
	System.out.println("test completed successfully");
}

}
