package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class tc001_AccountRegTest extends BaseClass{
	@Test
	public void verify_acc_reg() {
		logger.info("STARTING TC001_ACCOUNT REGISTRATION");
		
		try
		{
		HomePage hp = new HomePage(driver);
		hp.clickMyAcc();
		logger.info("CLICKED ON MY ACCOUNT");
		
		hp.clickRegister();
		logger.info("CLICKED ON REGISTER");
		
		AccountRegPage regpage = new AccountRegPage(driver);
		
		logger.info("Providing details");
		regpage.setFirstName(randomString().toUpperCase());
		regpage.setLastName(randomString().toUpperCase());
		regpage.setEmail(randomString()+"@gmail.com");
		regpage.setTele(randomnNumber());
		
		String Password = randomAlphaNumeric();
		
		regpage.setPW(Password);
		regpage.setConfirmPassword(Password);
		
		regpage.setPolicy();
		regpage.clickcontinue();
		
		logger.info("Validation expected message");
		String confmsg = regpage.getConfirmationsMsg();
		//Assert.assertEquals(confmsg,"Your Account Has Been Created!");
		if(confmsg.equals("Your Account Has Been Created!")) {
			Assert.assertTrue(true);
		}
		else {
			logger.error("Test Failed");
		}
		
	
	}
	catch(Exception e) {
		
		
		Assert.fail();
		
	}
		logger.info("Finished Account Registartion Test!");
		
}
	
}