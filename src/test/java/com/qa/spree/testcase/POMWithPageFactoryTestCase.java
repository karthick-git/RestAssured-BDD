package com.qa.spree.testcase;

import org.testng.annotations.Test;

import com.qa.pageobjects.spree.pagefactoryPOM.SpreePageFactoryScriptBase;

/*
Contains test scripts using POM with Page Factory.
*/
public class POMWithPageFactoryTestCase extends SpreePageFactoryScriptBase {
    @Test()
    public void positiveLoginCaseWithPageFactory() {
        homePage().goToLoginPage();
        loginPage().login("shiftedtech0000@gmail.com", "shiftedtech");
        homePage().checkLoginSuccessMessage();
    }

    @Test()
    public void negativeLoginCasePageFactory() {
        homePage().goToLoginPage();
        loginPage().login("shiftedtech0000@gmail.com", "shiftedtec");
        loginPage().checkLoginFailedMessage();
    }

    @Test()
    public void logoutCaseWithPageFactory() {
        homePage().goToLoginPage();
        loginPage().login("shiftedtech0000@gmail.com", "shiftedtech");
        homePage().checkLoginSuccessMessage();
        loginPage().logOut();
        homePage().checkLogoutSuccessMessage();
    }

    @Test()
    public void backAndForthTest() {
        homePage().goToLoginPage();
        loginPage().goToHomePage();
        homePage().goToCart();
        cartPage().goToHomePage();
        homePage().goToLoginPage();
        loginPage().login("shift@gmail.com", "shiftec");
        loginPage().checkLoginFailedMessage();
        loginPage().goToCart();
    }
}
