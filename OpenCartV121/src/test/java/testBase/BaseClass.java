package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	public Logger logger;	//log4j
	
	
	

	@BeforeClass
	@Parameters({"os","browser"})
	public void setup() {
	logger = LogManager.getLogger(this.getClass()); //log4j2
	
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
	driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	

	//to randomly generate string to send input in tc
	
	public String randomString()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
}
	
	//randomly generate number
	public String randomnNumber()
	{
		String generatedNumber = RandomStringUtils.randomNumeric(10);
		return generatedNumber;
}
	
	//randomly generate alphanumeric
	public String randomAlphaNumeric()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(10);
		String generatedNumber = RandomStringUtils.randomNumeric(10);
		return (generatedString+"@"+generatedNumber);
}
}
