package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class LogoutPage extends BasePageObject {

    private By productHeader = MobileBy.AccessibilityId("Products");
    private By loginHeader = By.xpath("//android.view.View[@content-desc='Login']");
    private By logoutButton = By.xpath("(//android.widget.Button)[1]");

    public void productHeaderDisplay() {
        isDisplayed(productHeader);
    }
    public void loginHeaderDisplay() {
        isDisplayed(loginHeader);
    }
    public void clickLogoutButton() {
        click(logoutButton);
    }
}
