package SeleniumFrameworkDemo.SeleniumFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	public static void main(String[] args) {
		String projectPath= System.getProperty("user.dir");
		System.out.println(projectPath);
		//System.setProperty("webdriver.gecko.driver", projectPath+"\\Drivers\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		

		
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options=new ChromeOptions();
//	       options.addArguments("--remote-allow-origins=*");
//		WebDriver driver=new ChromeDriver(options);
		WebDriver driver=new ChromeDriver();
//		
driver.get("https://www.selenium.dev");

driver.manage().window().maximize();//		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//System.setProperty("webdriver.edge.driver", projectPath+"\\Drivers\\msedgedriver.exe");
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
//		driver.get("https://www.selenium.dev");
		//driver.close();
	}



}
