package com.example.steps;

import com.example.app.pages.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartSteps {

    CartPage cartPage = new CartPage();
    @When("I click beli button")
    public void iClickBeliButton() {
       cartPage.clickBeliButton1();
    }

    @Then("product in cart is one")
    public void productInCartIsOne() {
        cartPage.cartIcon1Display();
    }

    @When("I click beli two product button")
    public void iClickBeliTwoProductButton() {
        cartPage.clickBeliButton1();
        cartPage.clickBeliButton2();
    }

    @Then("product in cart is two")
    public void productInCartIsTwo() {
        cartPage.cartIcon2Display();
    }
}
