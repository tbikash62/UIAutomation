package com.inetbaking.pageObjects;

import com.inetbanking.testCase.BASECLASS;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BASECLASS {
WebDriver driver;

public LoginPage(WebDriver Idriver)
{
	driver= Idriver;
	PageFactory.initElements(Idriver, this);
}
@FindBy(xpath="//input[@id='twotabsearchtextbox']")
WebElement searchproduct;

	public void searchProduct() {
		searchproduct.click();
		searchproduct.sendKeys("Titan Watches");
		searchproduct.sendKeys(Keys.ENTER);
	}


	/*
@FindBy(id="loginEmail")
WebElement txtUserName;

@FindBy(id ="loginPasswordLoginFormNew")
@CacheLookup
WebElement txtPassword;

@FindBy(id ="loginBtnNew")
@CacheLookup
WebElement btnLogin;

public void setUserName(String userName) {
	txtUserName.sendKeys(userName);
}
public void setpassword(String password) {
	txtPassword.sendKeys(password);
}
public void clickSubmit()
{
	btnLogin.click();
}
*/
}
