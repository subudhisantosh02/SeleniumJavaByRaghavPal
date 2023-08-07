package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {
	
	public static void main(String[] args) {
		test();
	}
	
	
	public static void test()
	{
		
		ChromeOptions options=new ChromeOptions();
		//options.addArguments("headless"); or 
		options.addArguments("--headless");
		WebDriver driver=new ChromeDriver(options);
		
		
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.id("APjFqb")).sendKeys("Abcd");
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		System.out.println("test completed");
		
	}

}
