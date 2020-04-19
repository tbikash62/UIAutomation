package com.inetbanking.testCase;
import com.inetbaking.pageObjects.LoginPage;
import org.testng.annotations.Test;

public class TC_Login_001 extends BASECLASS {
	 
	
	@Test
	public void logintest() throws Throwable
	{
		driver.get(baseURL);
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);

		driver.manage().window().maximize();
		Thread.sleep(10000);


		lp.searchProduct();
		Thread.sleep(5000);
		logger.info("Entered product to be searched");

		Thread.sleep(5000);






/*
		lp.setUserName(Username);
		logger.info("Entered username");
		Thread.sleep(2000);
		lp.setpassword(password);
		logger.info("Entered password");
		lp.clickSubmit();
		Thread.sleep(3000);
		if(driver.getTitle().equals("AMCAT Official : Employability Test | Job Search with AMCAT Score")) {
			Assert.assertTrue(true);
			logger.info("login  test passed");
	}
		else
		{
			Assert.assertTrue(false);
			logger.info("login test failed");
		
		}

	*/
		
	}

}
