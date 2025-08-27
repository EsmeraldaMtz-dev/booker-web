package org.upskillher.web.tests;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.upskillher.web.base.BaseTest;
import org.upskillher.web.pages.AdminPage;

public class LoginTests extends BaseTest {

    public AdminPage adminPage;
    @BeforeMethod
    public void setUpHomePage(){
        adminPage = new AdminPage(driver);
        navigateToAdminPage();
    }

    @Test(description = "Verificar login exitoso con credenciales válidas")
    @Epic("Portal Admin")
    @Feature("Login")
    @Story("Login con credenciales válidas")
    @Severity(SeverityLevel.BLOCKER)
    public void loginWithValidData(){
        Assert.assertTrue(adminPage.logOutBtnIsDisplayed(), "El botón logout debería estar visible tras el login");
    }

}
