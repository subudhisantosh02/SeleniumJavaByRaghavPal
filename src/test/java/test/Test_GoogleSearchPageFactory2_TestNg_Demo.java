package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertyfileOperation;
import pages.GoogleSearchPageFactory;

public class Test_GoogleSearchPageFactory2_TestNg_Demo {
	
	private static WebDriver driver=null;
	public static String browsername=null;
	
	@BeforeTest
	public static void setup_test() throws IOException
	{
		PropertyfileOperation.getProperties();
		if ( browsername.equalsIgnoreCase("chorme"))
		{
		driver=new ChromeDriver();
		}
		else if( browsername.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else 
		{
			driver=new EdgeDriver();
		}
		driver.get("https://www.google.com/");
	}

	@Test
	public static void googleSearch()
	{
		//WebDriver driver=new ChromeDriver();
		GoogleSearchPageFactory obj=new GoogleSearchPageFactory(driver);
		//driver.get("https://www.google.com/");
		obj.putTextintextBox("automation step by step");
		obj.clickOnSubmitButton();
		
		
	}
	
	@AfterTest
	public void teardown_test()
	{
		driver.close();
		System.out.println("test case passed");
	}
}
