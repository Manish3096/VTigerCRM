package com.Tiger2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Tiger2.pom.CreateFilter;
import com.Tiger2.pom.PurchaseOrder;
import com.Tiger2.pom.VtigerHomePage;

public class EditFilter2 extends Baseclass{
	@Test
	public void toEditFilter2() throws InterruptedException
	{
		VtigerHomePage v = new VtigerHomePage(d);
	    WebElement More = v.getMoredropdn();
	    Actions a = new Actions(d);
	    a.click(More).perform();//click on more dropdown
	    v.getPurchaseOrderlink().click();//click on Purchase Order dropdown
	    PurchaseOrder po = new PurchaseOrder(d);
	    po.getEditFilterlink().click();//click on editfilter link
	    CreateFilter cf = new CreateFilter(d);
	    WebElement col3 = cf.getColumn3Dropdn();
	    Select s = new Select(col3);	
	    s.selectByIndex(8);//select a specific column
	    cf.getSavebn().click();//click on save button
	    Reporter.log("PurchaseOrder filter was successfully edited");
	}
}
