package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class RegisterPage extends BasePageObject {
    private By registerHeader = By.xpath("//android.view.View[@content-desc=\"Register\"]");
    private By newFieldEmail = By.xpath("(//android.widget.EditText)[2]");
    private By newFieldPassword = By.xpath("(//android.widget.EditText)[3]");
    private By fieldNamaLengkap = By.xpath("(//android.widget.EditText)[1]");
    private By registerButton = By.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    private By registerPageButton = MobileBy.AccessibilityId("Register");
    private By namaLengkapError = MobileBy.AccessibilityId("fullname can not empty");
    private By errorRegister = MobileBy.AccessibilityId("Gagal :(");

    public void errorNamaLengkapDisplay() {
        isDisplayed(namaLengkapError);
    }
    public void errorRegisterDisplay() {
        isDisplayed(errorRegister);
    }
    public void RegisterHeaderDisplay() {
        isDisplayed(registerHeader);
    }
    public void clickRegisterButton() {
        click(registerButton);
    }
    public void clickRegisterPageButton() {
        click(registerPageButton);
    }
    public void inputNamaLengkap(String namaLengkap) {
        inputText(fieldNamaLengkap, namaLengkap);
    }
    public void inputNewEmail(String email) {
        inputText(newFieldEmail, email);
    }
    public void inputNewPassword(String password) {
        inputText(newFieldPassword, password);
    }
    public void clickNamalengkap() {
        click(fieldNamaLengkap);
    }
    public void clickNewEmail() {
        click(newFieldEmail);
    }
    public void clickNewPassword() {
        click(newFieldPassword);
    }
    public void clearNamalengkap() {
        clear(fieldNamaLengkap);
    }
    public void clearNewEmail() {
        clear(newFieldEmail);
    }
    public void clearNewPassword() {
        clear(newFieldPassword);
    }
}
