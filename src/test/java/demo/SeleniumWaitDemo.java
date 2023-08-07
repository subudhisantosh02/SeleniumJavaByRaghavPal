package demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitDemo {
	
	public static void main(String[] args) {
		seleniumWaits();
	}
	
	public static void seleniumWaits()
	{
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("APjFqb")).sendKeys("selenium step by step");
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).sendKeys(Keys.RETURN);
		
		
		
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//WebElement element=driver.findElement(By.xpath("abcd"));
		
		WebElement we=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("abcd"))));
		
		//WebElement we=wait.until(ExpectedConditions.elementToBeClickable(element))));
		
		
		driver.close();
		driver.quit();
		
	}

}
