package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class LoginPage extends BasePageObject {
    private By productHeader = MobileBy.AccessibilityId("Products");
    private By fieldEmail = By.xpath("//android.widget.EditText[@text = 'Email']");
    private By fieldPassword = By.xpath("//android.widget.EditText[@text = 'Password']");
    private By loginButton = By.xpath("//android.widget.Button[@content-desc='Login']");
    private By signinButton = By.xpath("(//android.widget.Button)[1]");
    private By emailError = MobileBy.AccessibilityId("email can not empty");
    private By passwordError = MobileBy.AccessibilityId("password can not empty");
    private By accountError = MobileBy.AccessibilityId("Email atau password tidak valid.");
    public void productHeaderDisplay() {
        isDisplayed(productHeader);
    }
    public void signinButtonDisplay() {
        isDisplayed(signinButton);
    }
    public void emailErrorDisplay() {
        isDisplayed(emailError);
    }
    public void passwordErrorDisplay() {
        isDisplayed(passwordError);
    }
    public void accountErrorDisplay() {
        isDisplayed(accountError);
    }
    public void loginButtonDisplay() {
        isDisplayed(loginButton);
    }
    public void inputEmail(String email) {
        inputText(fieldEmail, email);
    }
    public void inputPassword(String password) {
        inputText(fieldPassword, password);
    }
    public void clickEmailField() {
        click(fieldEmail);
    }
    public void clickPasswordField() {
        click(fieldPassword);
    }
    public void clickLoginButton() {
        click(loginButton);
    }
    public void clicksigninButton() {
        click(signinButton);
    }
}
