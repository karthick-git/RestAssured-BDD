package com.qa.pageobjects.spree.objectrepoPOM;

import com.qa.scriptbase.ScriptBase;

public class SpreeObjectRepositoryScriptBase extends ScriptBase {
    private HomePageObjectRepository homePage;
    private LoginPageObjectRepository loginPage;
    private CartPageObjectRepository cartPage;

    public HomePageObjectRepository homePage() {
        if(homePage == null) {
            homePage = new HomePageObjectRepository(driver);
            // When homePage is null, that means the script has not used driver.navigate() to get
            // to the homePage's baseURL. Calling any other method than navigate... will cause
            // WebElements to not be found.
            driver.navigate().to(homePage.baseURL);
        }
        return homePage;
    }

    public LoginPageObjectRepository loginPage() {
        if(loginPage == null) {
            loginPage = new LoginPageObjectRepository(driver);
        }
        return loginPage;
    }

    public CartPageObjectRepository cartPage() {
        if(cartPage == null) {
            cartPage = new CartPageObjectRepository(driver);
        }
        return cartPage;
    }
}
