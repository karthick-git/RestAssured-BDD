package com.qa.spree.testcase;

import org.testng.annotations.Test;

import com.qa.pageobjects.spree.objectrepoPOM.SpreeObjectRepositoryScriptBase;

/*
Contains test scripts using POM with Object Repository.
*/
public class POMWithObjectRepositoryTestCase extends SpreeObjectRepositoryScriptBase {
    @Test()
    public void positiveLoginCaseWithObjectRepository() {
        homePage().goToLoginPage();
        loginPage().login("shiftedtech0000@gmail.com", "shiftedtech");
        homePage().checkLoginSuccessMessage();
    }

    @Test()
    public void negativeLoginCaseWithObjectRepository() {
        homePage().goToLoginPage();
        loginPage().login("shiftedtech0000@gmail.com", "shiftedtec");
        loginPage().checkLoginFailedMessage();
    }

    @Test()
    public void logoutCaseWithObjectRepository() {
        homePage().goToLoginPage();
        loginPage().login("shiftedtech0000@gmail.com", "shiftedtech");
        homePage().checkLoginSuccessMessage();
        loginPage().logOut();
        homePage().checkSignoutSuccessMessage();
    }
}
