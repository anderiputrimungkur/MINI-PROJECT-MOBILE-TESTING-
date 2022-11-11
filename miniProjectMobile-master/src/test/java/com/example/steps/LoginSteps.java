package com.example.steps;

import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    @Given("I am on login page")
    public void iAmOnLoginPage() {
        loginPage.loginButtonDisplay();
    }

    @When("I input valid email")
    public void iInputValidEmail() {
        loginPage.clickEmailField();
        loginPage.inputEmail("imanuel@gmail.com");
    }

    @And("I input Valid password")
    public void iInputValidPassword() {
        loginPage.clickPasswordField();
        loginPage.inputPassword("123456");
    }

    @And("I click login Button")
    public void iClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I go to Product Page")
    public void iGoToProductPage() {
        loginPage.productHeaderDisplay();
    }

    @And("I input invalid email")
    public void iInputInvalidEmail() {
        loginPage.clickEmailField();
        loginPage.inputEmail("test22");
    }

    @And("I input inValid password")
    public void iInputInValidPassword() {
        loginPage.clickPasswordField();
        loginPage.inputPassword("test11");
    }

    @Given("I click signin button")
    public void iClickSigninButton() {
        loginPage.clicksigninButton();
    }

    @Then("I get error message email can not empty")
    public void iGetErrorMessageEmailCanNotEmpty() {
        loginPage.emailErrorDisplay();
    }

    @Then("I get error message password can not empty")
    public void iGetErrorMessagePasswordCanNotEmpty() {
        loginPage.passwordErrorDisplay();
    }

    @Then("I get error message account invalid")
    public void iGetErrorMessageAccountInvalid() {
        loginPage.accountErrorDisplay();
    }
}
