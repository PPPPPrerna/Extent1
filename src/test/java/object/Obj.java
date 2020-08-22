package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Obj {
	
	WebDriver driver =null;
	
	public Obj(WebDriver driver){
		
		this.driver=driver;
		
	}
	
	public WebElement name() {
		
		WebElement name =driver.findElement(By.xpath("//input[@name='name']"));
		
		return name;
	}
	
	public WebElement email() {
		
		WebElement email =driver.findElement(By.xpath("//input[@name='email']"));
		return email;
	}
	
	public WebElement text() {
		
		WebElement text=driver.findElement(By.xpath("//textarea[@type='text']"));
		
		return text;
	}
	
	public WebElement submit() {
		
		WebElement submit =driver.findElement(By.xpath("//input[@type='submit']"));
		
		return submit;
	}

}
