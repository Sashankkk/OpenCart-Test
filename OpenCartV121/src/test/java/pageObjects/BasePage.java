package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	//Using PageFactory 
		WebDriver driver;
		
		//constructor
		BasePage(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
}
