package com.vtiger.generics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.vtiger.pom.HomePage;
import com.vtiger.pom.LoginPage;

public class BaseClass {
	static
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	}
	public static WebDriver driver;
	public FileLib f=new FileLib();
	@BeforeTest
	
	public void openBrowser() throws InterruptedException
	{
		System.out.println("opening browser ");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}
	
	@AfterTest
	public void closeBrowser()
	{
//		driver.close();
//		Reporter.log("browser is closed",true);
	}
	
	@BeforeMethod
	public void login() throws IOException
	{
		System.out.println("login");
		String url = f.getPropertyData("url");
		String username = f.getPropertyData("username");
		String password = f.getPropertyData("password");
		driver.get(url);
		LoginPage l=new LoginPage(driver);
		l.setLogin(username, password);
	}
	@AfterMethod
	public void logout() throws InterruptedException
	{
		System.out.println("logged out successfully");
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getAccount()).perform();
		h.clicksignoutLink();
		Thread.sleep(4000);
	}
	

}
