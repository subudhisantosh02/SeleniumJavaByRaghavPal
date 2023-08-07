package test;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GooglrSearchPage;

public class Test1_GoogleSearch2 {
	
	 private static WebDriver driver=null;
	public static void main(String[] args) {
		googleSearch();
	}
	public static void googleSearch()
	{
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.id("APjFqb")).sendKeys("selenium step by step");
		GooglrSearchPage.textbox_search(driver).sendKeys("selenium step by step");
		
	
		
		//driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
		//GooglrSearchPage.button_search(driver).click();
	//	GooglrSearchPage.button_search(driver).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).sendKeys(Keys.ENTER);
		driver.close();
		System.out.println("test completed successfully");
	}

}
