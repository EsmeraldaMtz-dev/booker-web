package org.upskillher.web.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.upskillher.web.base.BasePage;
import org.upskillher.web.maps.AdminPageMaps;

public class AdminPage extends BasePage {

    public AdminPage(WebDriver driver) {
        super(driver);
    }

    @Step("Validar que el botón LogOut es visible")
    public boolean logOutBtnIsDisplayed(){
        loginwithValidCredentials();
        return waitForElementClickable(AdminPageMaps.LOGOUT_BTN).isDisplayed();
    }

    @Step("Login con credenciales válidas")
    public void loginwithValidCredentials(){
        setSafeText(AdminPageMaps.USERNAME_INPUT, "admin");
        setSafeText(AdminPageMaps.PASSWORD_INPUT, "password");
        safeClick(AdminPageMaps.LOGIN_BTN);
    }

    @Step("Crear un nuevo Room")
    public boolean newRoomIsCreated(){
        setSafeText(AdminPageMaps.ROOM_NUM, "");
        return false;
    }

}
