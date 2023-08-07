package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	static WebDriver driver=null;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
@AfterTest
public void teardown()
{
	driver.quit();
}



	

	@Test(dataProvider="test1Data") 
	 public void test1(String username,String password) throws InterruptedException
	 { 
		System.out.println(username+"  |   "+password);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).submit();
	}

	
	@DataProvider(name="test1Data")
	public static Object[][] getData()
	{
		Object data[][]=testData("C:\\Users\\DELL\\eclipse-workspace\\SeleniumFramework\\Excel\\data.XLSX", "sheet1");
		return data;
	}
	
	public static Object[][] testData(String Excelpath,String sheetName)
	{
		ExcelUtils eu=new ExcelUtils(Excelpath, sheetName);
		
		int rowcount=eu.getRowCount();
		System.out.println("No of rows:"+rowcount);
		int colcount=eu.getColumnCount();
		System.out.println("No of columns:"+colcount);
		
		Object data[ ] [ ]=new Object[rowcount ][ colcount];
		
		for (int i=1;i<=rowcount;i++ )
		{
			for (int j=0;j<=colcount-1;j++)
			{
			String cellData=	eu.getCellStringData(i, j);
			System.out.print(cellData+"     |     ");
			//double cellData=eu.getCellNumericData(i, j);
			data[i-1] [j ]=cellData;
			}
			System.out.println();
		}
		return data;
	}

}
