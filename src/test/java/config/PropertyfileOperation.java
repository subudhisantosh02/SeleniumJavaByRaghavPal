package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.Test_GoogleSearchPageFactory2_TestNg_Demo;

public class PropertyfileOperation {
	
	static String projectPath=System.getProperty("user.dir");
	static Properties prop =new Properties();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		getProperties();
		setProperties();
	}
  
	public static void getProperties() throws IOException
	{
		//File f=new File(C:\Users\DELL\eclipse-workspace\SeleniumFramework\src\test\java\config\config.properties);
		//Properties prop =new Properties();
		//System.out.println(str);
		InputStream input=new FileInputStream(projectPath+"\\src\\test\\java\\config\\config.properties");
		
		prop.load(input);
		
		System.out.println(prop.getProperty("browser"));
		Test_GoogleSearchPageFactory2_TestNg_Demo.browsername=prop.getProperty("browser");
		//return prop.getProperty("browser");
	}
	
	public static void setProperties() throws IOException
	{
		OutputStream output=new FileOutputStream(projectPath+"\\src\\test\\java\\config\\config.properties");
		//Properties prop =new Properties();
		prop.setProperty("browser", "chrome");
		prop.store(output, null);
	}
}
