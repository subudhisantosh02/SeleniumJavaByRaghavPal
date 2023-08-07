package SeleniumFrameworkDemo.SeleniumFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DesiredCapabilities cap=new DesiredCapabilities();
		//cap.setAcceptInsecureCerts(true);
		//cap.setCapability(null, cap);
		//WebDriver driver=new ChromeDriver(cap);
		WebDriver driver=new EdgeDriver();
	//	driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium step by step");
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).sendKeys(Keys.ENTER);
		driver.close();
	}

}
