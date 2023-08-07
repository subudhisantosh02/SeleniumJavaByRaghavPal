package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsBasicDemo {
	
	private static WebDriver driver=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("extent.html");
		extent.attachReporter(spark);
		
		ExtentTest test1=extent.createTest("Google search test","this is my first gioogle search test");
		  //.log(Status.PASS, "This is a logging event for Google search test, and it passed!");
		 
		driver=new ChromeDriver();
		
		test1.log(Status.INFO, "Starting test case");
		
		driver.get("https://www.google.com/");
		test1.pass("naviaged to google page");
		
        driver.findElement(By.id("APjFqb")).sendKeys("selenium step by step");
        test1.fail("ëntered text in text box");
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).sendKeys(Keys.ENTER);
		test1.pass("press enter from key board");
		driver.close();
		test1.pass("close the browser");
		//System.out.println("test completed successfully");
		test1.info("test case completed");
		
		extent.flush();

	}

}
