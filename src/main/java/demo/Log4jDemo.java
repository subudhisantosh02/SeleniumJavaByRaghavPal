package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	private static Logger logger=LogManager.getLogger(Log4jDemo.class);
	
	public Log4jDemo() {
	//PropertyConfigurator.configure("C:\\Users\\DELL\\eclipse-workspace\\SeleniumFramework\\src\\main\\java\\resources\\log4j2.properties");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n   Hello World...!      \n");
		
		logger.info("this is information message");
		logger.error("this is a error messge");
		logger.warn("This is a warning message");
		logger.fatal("This is a fatal message");
		
		System.out.println(" \n  completed");
		

	}

}
