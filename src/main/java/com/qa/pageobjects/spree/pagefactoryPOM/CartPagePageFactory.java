package com.qa.pageobjects.spree.pagefactoryPOM;

import com.qa.scriptbase.ScriptBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPagePageFactory extends BasePagePageFactory {

    public CartPagePageFactory(WebDriver driver) {
        this.driver = driver;
        this.driverWait = new WebDriverWait(driver, ScriptBase.DEFAULT_WEB_DRIVER_WAIT);
        this.driverJSExecutor = (JavascriptExecutor) driver;

        PageFactory.initElements(driver, this);
    }
}
