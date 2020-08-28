package com.Tiger2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Tiger2.pom.CreateFilter;
import com.Tiger2.pom.PurchaseOrder;
import com.Tiger2.pom.VtigerHomePage;

public class DeleteFilter1 extends Baseclass {
	@Test
	public void toDeleteFilter1() throws InterruptedException
	{
		VtigerHomePage v = new VtigerHomePage(d);
	    WebElement More = v.getMoredropdn();
	    Actions a = new Actions(d);
	    a.click(More).perform();//click on More dropdown
	    v.getPurchaseOrderlink().click();//click on purchase order link
	    PurchaseOrder po = new PurchaseOrder(d);
	    WebElement filter = po.getFiltersdropdn();
	    Select s = new Select(filter);
	    s.selectByIndex(0);//Select the specific filter to be deleted
	    po.getDeleteFilterlink().click();//click on deletefilter link
	    d.switchTo().alert().accept();//click on ok in the alert popup
	    Reporter.log("Filter is successfully deleted");
	}
}
