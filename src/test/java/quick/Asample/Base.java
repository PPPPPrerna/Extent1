package quick.Asample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	static Properties prop;
	static WebDriver driver=null;
	
	
	public static WebDriver  initialize() throws IOException {
		
	FileInputStream fis = new FileInputStream("C:\\Users\\Dr Pramod Pandey\\eclipse-workspace\\Asample\\resources\\data.properties");	
	
	
	prop=new Properties();
	
	prop.load(fis);
	
	String browser=prop.getProperty("browser");
	
	if(browser.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dr Pramod Pandey\\Desktop\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 

		
	}
	
	
	return driver;
	
	
	
	}
	

}
