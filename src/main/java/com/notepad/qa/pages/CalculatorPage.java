package com.notepad.qa.pages;

import com.notepad.qa.base.TestBase;
import io.appium.java_client.windows.WindowsElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage extends TestBase {

    @FindBy(name="File")
    WebElement fileBtn;

    @FindBy(name="Edit")
    WindowsElement editBtn;
     
    public CalculatorPage()
    {
    	PageFactory.initElements(driver,this);
    }

//    public NotepadPage()
//    {
//        PageFactory.initElements(driver,this);
//    }
    
    public void number(int val)
    {
    	switch(val)
    	{
    	case 0:
    		driver.findElementByName("Zero").click();
    	case 1:
    		driver.findElementByName("One").click();
    	case 2:
    		driver.findElementByName("Two").click();
    	case 3:
    		driver.findElementByName("Three").click();
    	case 4:
    		driver.findElementByName("Four").click();
    	case 5:
    		driver.findElementByName("Five").click();
    	case 6:
    		driver.findElementByName("Six").click();
    	case 7:
    		driver.findElementByName("Seven").click();
    	case 8:
    		driver.findElementByName("Eight").click();
    	case 9:
    		driver.findElementByName("Nine").click();
    	default:
    		return ;
    	}
    }
    
    public void clickPlus()
    {
    	driver.findElementByName("Plus").click();
    }

    public String sum(int a, int b)
    {
    	number(a);
    	clickPlus();
    	number(b);
    	return driver.findElementByAccessibilityId("CalculatorResults").getText().toString();
    	
    }
    
    public long square(int a)
    {
    	return a*a;
    }
}
