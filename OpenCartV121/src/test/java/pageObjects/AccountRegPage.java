package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegPage extends BasePage {

	//constructor
	public AccountRegPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//locator
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtLName;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txtTele;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPw;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtCPw;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkdpolicy;
	

	@FindBy(xpath="//input[@value='Continue']")
	WebElement btncontinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	//Actions
	public void setFirstName(String fname) {
		txtFName.sendKeys(fname);
	}
	public void setLastName(String Lname) {
		txtLName.sendKeys(Lname);
	}
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	public void setTele(String tel) {
		txtTele.sendKeys(tel);
	}
	public void setPW(String pwd) {
		txtPw.sendKeys(pwd);
	}
	public void setConfirmPassword(String pwd) {
		txtCPw.sendKeys(pwd);
	}
	public void setPolicy() {
		chkdpolicy.click();
	}
	
	public void clickcontinue() {
		btncontinue.click();
	}
	
	
	public String getConfirmationsMsg() {
		try {
			return(msgConfirmation.getText());
		}
		catch(Exception e) {
			return(e.getMessage());
		}
	}
		
	
	
	
	
	
	}
	

	
	

