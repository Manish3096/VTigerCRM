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

public class EditFilterSales1 extends Baseclass {
	@Test
	public void toEditFilter1() throws InterruptedException
	{
		VtigerHomePage v = new VtigerHomePage(d);
	    WebElement More = v.getMoredropdn();
	    Actions a = new Actions(d);
	    a.click(More).perform();//click on more Dropdown
	    v.getSalesOrderlink().click();//click on SalesOrder link
	    SalesOrderPage s = new SalesOrderPage(d);
	    s.getEditfilterLink().click();//click on editfilter link
	    CreateFilter cf = new CreateFilter(d);
	    WebElement col3 = cf.getColumn3Dropdn();
	    Select s2 = new Select(col3);	
	    s2.selectByIndex(18);//select a specific column name
	    WebElement duration = cf.getSelectDurationDropdn();
	    Select s1 = new Select(duration);
	    s1.selectByIndex(9);//select a specific duration
	    cf.getSavebn().click();//click on save button
	    Reporter.log("SalesOrder filter was successfully edited");
	} 
}
