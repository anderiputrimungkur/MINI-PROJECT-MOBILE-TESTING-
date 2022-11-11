package com.example.steps;

import com.example.app.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
    
    RegisterPage registerPage = new RegisterPage();
    @And("I click register page button")
    public void iClickRgisterPageButton() {
        registerPage.clickRegisterPageButton();
    }

    @And("I am on the Register page")
    public void iAmOnTheRegisterPage() {
        registerPage.RegisterHeaderDisplay();
    }

    @When("I click Register button")
    public void iClickRegisterButton() {
        registerPage.clickRegisterButton();
    }

    @When("I input nama lengkap")
    public void iInputNamaLengkap() {
        registerPage.clickNamalengkap();
        registerPage.inputNamaLengkap("Imanuel Wagiu");
    }
    @Then("I get error message nama lengkap can not empty")
    public void iGetErrorMessageNamaLengkapCanNotEmpty() {
        registerPage.errorNamaLengkapDisplay();
    }

    @Then("I success register my account")
    public void iSuccessRegisterMyAccount() {
        registerPage.RegisterHeaderDisplay();
    }

    @And("I clear all field value")
    public void iClearAllFieldValue() {
        registerPage.clickNamalengkap();
        registerPage.clearNamalengkap();
        registerPage.clickNewEmail();
        registerPage.clearNewEmail();
        registerPage.clickNewPassword();
        registerPage.clearNewPassword();
    }

    @And("I input email")
    public void iInputEmail() {
        registerPage.clickNewEmail();
        registerPage.inputNewEmail("akunbaru1");
    }

    @And("I input password")
    public void iInputPassword() {
        registerPage.clickNewPassword();
        registerPage.inputNewPassword("passwordAkun");
    }

    @And("I input available password")
    public void iInputAvailablePassword() {
        registerPage.clickNewPassword();
        registerPage.inputNewPassword("123123123");

    }

    @When("I input available nama lengkap")
    public void iInputAvailableNamaLengkap() {
        registerPage.clickNamalengkap();
        registerPage.inputNamaLengkap("Alex Under");
    }

    @And("I input available email")
    public void iInputAvailableEmail() {
        registerPage.clickNewEmail();
        registerPage.inputNewEmail("alex@email.com");
    }

    @Then("I get error message")
    public void iGetErrorMessage() {
        registerPage.errorRegisterDisplay();
    }
}
