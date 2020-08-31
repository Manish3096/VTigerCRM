package com.Tig.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.Tig.pom.LoginPage;
import com.Tig.pom.VtigerHomePage;



 public class Baseclass {
	   static {
		   System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	   }
	   
	   public FileLibrary f = new FileLibrary();
	   public static WebDriver d;
	   
	   @BeforeTest 
	   public void openBrowser()
	   {
		   System.out.println("open Browser");
		   d = new ChromeDriver();
		   d.manage().window().maximize();
		   d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   }
	   
	   @AfterTest
	   public void closeBrowser()
	   {
		   System.out.println("close Browser");
		   d.quit();
		   
	   }
	   
	   @BeforeMethod
	   public void login() throws IOException
	   {
		   System.out.println("LOGIN");
		   String url =f.getPropertyData("url");
		   String u = f.getPropertyData("un");
		   String p = f.getPropertyData("pw");
		   d.get(url);
		   LoginPage l = new LoginPage(d);
		   l.setLogin(u, p);
	   }
	   
	   @AfterMethod
	   public void logout()
	   {
		   VtigerHomePage v =new VtigerHomePage(d);
		   v.getAdministratorfirstbn().click();
		   v.getSignoutlink().click();
		   System.out.println("Logout");
	   }

	

	
 
}
