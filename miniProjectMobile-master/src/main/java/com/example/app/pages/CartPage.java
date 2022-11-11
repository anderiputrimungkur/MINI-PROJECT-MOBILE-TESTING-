package com.example.app.pages;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class CartPage extends BasePageObject {

    private By beliButton1 = By.xpath("(//android.widget.Button[@content-desc='Beli'])[1]");
    private By beliButton2 = By.xpath("(//android.widget.Button[@content-desc='Beli'])[2]");
    private By cartIcon1 = By.xpath("//android.widget.Button[@content-desc='1']");
    private By cartIcon2 = By.xpath("//android.widget.Button[@content-desc='2']");

    public void cartIcon1Display() {
        isDisplayed(cartIcon1);
    }
    public void cartIcon2Display() {
        isDisplayed(cartIcon2);
    }
    public void clickBeliButton1() {click(beliButton1);}
    public void clickBeliButton2() {click(beliButton2);}
}
