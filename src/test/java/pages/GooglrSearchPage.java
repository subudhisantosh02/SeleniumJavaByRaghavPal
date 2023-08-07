package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglrSearchPage {
	//static WebDriver driver;
	private static WebElement element=null;
	public static WebElement textbox_search(WebDriver driver)
	{
		//driver=new ChromeDriver();
		 element=driver.findElement(By.id("APjFqb"));
		 return element;
	}
	public static WebElement button_search(WebDriver driver)
	{
		//driver=new ChromeDriver();
		 element=driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
		 return element;
	}


}
