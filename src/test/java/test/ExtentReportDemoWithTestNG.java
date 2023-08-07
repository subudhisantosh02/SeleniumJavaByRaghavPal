package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemoWithTestNG {
	private static WebDriver driver;
	ExtentReports extent;
	ExtentSparkReporter spark;
	@BeforeSuite
	public void setup()
	{
		extent = new ExtentReports();
		spark=new ExtentSparkReporter("extent.html");
		extent.attachReporter(spark);
		
	}
	@BeforeTest
	public void brwser()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test1()
	{
		ExtentTest test1=extent.createTest("Google search test","this is my first gioogle search test");
		  //.log(Status.PASS, "This is a logging event for Google search test, and it passed!");
		 
		
		
		test1.log(Status.INFO, "Starting test case");
		
		driver.get("https://www.google.com/");
		test1.pass("naviaged to google page");
		
      driver.findElement(By.id("APjFqb")).sendKeys("selenium step by step");
      test1.fail("ëntered text in text box");
      test1.addScreenCaptureFromPath("scrnsht.png");
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).sendKeys(Keys.ENTER);
		test1.pass("press enter from key board");
		//driver.close();
		test1.pass("close the browser");
		//System.out.println("test completed successfully");
		test1.info("test case completed");
	}
	
	@Test
	public void test2()
	{
		ExtentTest test2=extent.createTest("Google search test1","this is my second google search test");
		  //.log(Status.PASS, "This is a logging event for Google search test, and it passed!");
		 
		
		
		test2.log(Status.INFO, "Starting test case");
		
		driver.get("https://www.google.com/");
		test2.pass("naviaged to google page");
		
      driver.findElement(By.id("APjFqb")).sendKeys("selenium step by step");
      test2.fail("ëntered text in text box");
      test2.addScreenCaptureFromPath("scrnsht.png");
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).sendKeys(Keys.ENTER);
		test2.pass("press enter from key board");
		
		test2.pass("close the browser");
		//System.out.println("test completed successfully");
		test2.info("test case completed");
	}
	
	@AfterTest
	public void closeDriver()
	{
		driver.quit();;
	}
	@AfterSuite
	public void teardown()
	{
		extent.flush();
	}
}
