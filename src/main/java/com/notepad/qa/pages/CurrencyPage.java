package com.notepad.qa.pages;

import com.notepad.qa.base.TestBase;

public class CurrencyPage extends TestBase {

    public boolean checkEditOption()
    {
        return driver.findElementByName("Edit").isDisplayed();
    }

}
