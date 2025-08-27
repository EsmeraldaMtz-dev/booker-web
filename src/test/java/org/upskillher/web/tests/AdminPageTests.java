package org.upskillher.web.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.upskillher.web.base.BaseTest;
import org.upskillher.web.pages.AdminPage;

public class AdminPageTests extends BaseTest {

    public AdminPage adminPage;
    @BeforeMethod
    public void setUpHomePage(){
        adminPage = new AdminPage(driver);
        //softAssert = new SoftAssert();
        navigateToAdminPage();
        adminPage.loginwithValidCredentials();
    }
    @Test
    public void newRoomCreation(){
        Assert.assertTrue(adminPage.newRoomIsCreated(), "new Room should be displayed");
    }
}
