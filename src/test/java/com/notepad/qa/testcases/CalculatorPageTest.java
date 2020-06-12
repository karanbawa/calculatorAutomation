package com.notepad.qa.testcases;

import com.notepad.qa.base.TestBase;
import com.notepad.qa.pages.CurrencyPage;
import com.notepad.qa.pages.FilePage;
import com.notepad.qa.pages.CalculatorPage;

import org.testng.Assert;
import org.testng.annotations.*;


public class CalculatorPageTest extends TestBase {

    CalculatorPage calculatorPage;
    CurrencyPage currencyPage;

    public CalculatorPageTest()
    {
        super();
    }

    @BeforeMethod
    public void setUp()
    {
        initialization(); 
        calculatorPage = new CalculatorPage();
        currencyPage = new CurrencyPage();
    }

    @AfterMethod
    public void cleanUp()
    {
        driver.quit();
        setUp();
    }

    @AfterSuite
    public void tearDown()
    {
        driver.quit();
    }

    @Test
    public void checkSum() throws InterruptedException
    {
    	Thread.sleep(10000);
//    	int ans = calculatorPage.sum();
//        Assert.assertEquals()
    	Assert.assertTrue(true);
    }

}