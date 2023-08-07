package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	static WebDriver driver=null;
	By textBox_Search =By.id("APjFqb");
	By search_Button=By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']");
	
	public GoogleSearchPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setTextinSearchBox(String text)
	{
		driver.findElement(textBox_Search).sendKeys(text);
	}
	
	public void clickOnSearchButton()
	{
		driver.findElement(search_Button).sendKeys(Keys.ENTER);
	}

}
