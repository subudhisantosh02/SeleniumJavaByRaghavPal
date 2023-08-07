package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageFactory;

public class Test_GoogleSearchPageFactory {
	
	private static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googleSearch();
		}

	public static void googleSearch()
	{
		WebDriver driver=new ChromeDriver();
		GoogleSearchPageFactory obj=new GoogleSearchPageFactory(driver);
		driver.get("https://www.google.com/");
		obj.putTextintextBox("automation step by step");
		obj.clickOnSubmitButton();
		driver.close();
		System.out.println("test case passed");
		
	}
}
