package quick.Asample;

import java.io.IOException;
import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.logging.log4j.*;

import object.Obj;

public class AsTest extends Base {
	
	org.apache.logging.log4j.Logger log = LogManager.getLogger(AsTest.class.getName());
	
	WebDriver driver=null;
	
	@BeforeTest
	public void beforeany() throws IOException {
		
this.driver=initialize();
		
		driver.get(prop.getProperty("url"));
		
			
		
			
		

		}
	
	@Test(dataProvider="provide")
	public void imp(String username , String email , String text) throws IOException {
		
		Obj ob= new Obj(driver);
		
		ob.name().sendKeys(username);
		
		log.info("User name entered");
		
		ob.email().sendKeys(email);
		log.info("email id entered");
		ob.text().sendKeys(text);
		log.info("text entered");
		
		ob.submit().click();
	
	}
	
	@DataProvider
	public Object[][] provide() {
		
		Object ob[][] = new Object[1][3];
		ob[0][0]="Prerna";
		ob[0][1]="prerna.pandey@metlife.com";
		ob[0][2]="New framework1";
		
		return ob;
		
				
		
		
	}
	
	@AfterTest
	
	public void fin() {
		
		driver.close();
		
		
	}

}
