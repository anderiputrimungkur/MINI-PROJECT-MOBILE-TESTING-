package com.example.steps;

import com.example.app.pages.LogoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSteps {

    LogoutPage logoutPage = new LogoutPage();
    @When("I am on product page")
    public void iAmOnProductPage() {
        logoutPage.productHeaderDisplay();
    }

    @And("I click loguot button")
    public void iClickLoguotButton() {
        logoutPage.clickLogoutButton();
    }

    @Then("I go to Login page")
    public void iGoToLoginPage() {
        logoutPage.loginHeaderDisplay();
    }
}
