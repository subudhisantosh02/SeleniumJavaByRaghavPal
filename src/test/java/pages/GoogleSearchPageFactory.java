package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPageFactory {
	
	private static WebDriver driver=null;
	
	@FindBy(id="APjFqb")
	WebElement text_Box;
	
	@FindBy(xpath="//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")
	WebElement button_Submit;
	
	public GoogleSearchPageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void putTextintextBox(String text)
	{
		text_Box.sendKeys(text);
	}
	public void clickOnSubmitButton()
	{
		button_Submit.sendKeys(Keys.ENTER);
	}

}
