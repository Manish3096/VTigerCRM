package com.Tiger2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Tiger2.pom.CreateFilter;
import com.Tiger2.pom.PurchaseOrder;
import com.Tiger2.pom.SalesOrderPage;
import com.Tiger2.pom.VtigerHomePage;

public class DeleteFilterSales1 extends Baseclass {
	@Test
	public void toDeleteFilter1() throws InterruptedException
	{
		VtigerHomePage v = new VtigerHomePage(d);
	    WebElement More = v.getMoredropdn();
	    Actions a = new Actions(d);
	    a.click(More).perform();//click on More dropdown
	    v.getSalesOrderlink().click();//click on sales Order link
	    SalesOrderPage s = new SalesOrderPage(d);
	    WebElement filter = s.getFiltersDropdn();
	    Select s1 = new Select(filter);
	    s1.selectByIndex(0);//select a specific filter created
	    s.getDeletefilterLink().click();//click on delete filter link
	    d.switchTo().alert().accept();//click on ok in the popup
	    Reporter.log("Filter is successfully deleted");
	}
}
