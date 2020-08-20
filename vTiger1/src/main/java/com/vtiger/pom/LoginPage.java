package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement usertbx;
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement passwordtbx;
	@FindBy(id="submitButton")
	private WebElement loginbtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this );
	}
	
	public void setLogin(String username,String password)
	{
		usertbx.sendKeys(username);
		passwordtbx.sendKeys(password);
		loginbtn.click();
	}
	
	

}
