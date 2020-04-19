package com.inetbanking.testCase;

import com.inetbanking.utilities.ReadConfig;
import logs.log4j;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



public class BASECLASS {
	ReadConfig readconfig = new ReadConfig();
public	String baseURL =readconfig.getApplicationURL();
public 	String Username = readconfig.getUsername();
public 	String password =readconfig.getPassword();
public static WebDriver driver;
public static Logger logger;
@Parameters("browser")
@BeforeClass
public void setUp(String br) {
	/*System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
	driver = new ChromeDriver();*/
	logger  = Logger.getLogger(log4j.class);
	if(br.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	driver = new ChromeDriver();
	}
	else if(br.equals("firefox")) {
		System.setProperty("webdriver.chrome.driver","./Drivers/geckodriver.exe" );
		driver = new FirefoxDriver();
		
	}
	driver.get(baseURL);
}
@AfterClass
public void  tearDown() {
 driver.quit();
 
	
}

}
