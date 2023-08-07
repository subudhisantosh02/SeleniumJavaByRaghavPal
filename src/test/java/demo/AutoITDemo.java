package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileUploadUsingAutoIT();
	}
	
	public static void FileUploadUsingAutoIT() throws IOException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.imacros.net/Automate/FileUploadDemo");
		
		driver.findElement(By.xpath("//input[@id='uploaded_file']")).click();
		Runtime.getRuntime().exec("C:\\Users\\DELL\\Desktop\\autoit\\FileuploadScript.exe");
		Thread.sleep(3000);
		
		//driver.close();
	}

}
