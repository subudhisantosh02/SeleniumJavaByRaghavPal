package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;


public class Test_GoogleSerachPageObject {
	
	private static WebDriver driver=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googleSearch1();
	}	
	
	public static void googleSearch1()
	{	
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		GoogleSearchPageObjects  obj=new GoogleSearchPageObjects(driver);
		obj.setTextinSearchBox("automation step by step");
		obj.clickOnSearchButton();
		System.out.println("test case passed");
	}

}
