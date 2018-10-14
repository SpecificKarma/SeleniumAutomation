package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    private final WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getFirstNameTextField() {
        return driver.findElement(By.id("checkout.shipping.addressSelector.newAddress.address.firstName"));
    }

    public WebElement getLastNameTextField() {
        return driver.findElement(By.id("checkout.shipping.addressSelector.newAddress.address.lastName"));
    }

    public WebElement getStreetField() {
        return driver.findElement(By.id("checkout.shipping.addressSelector.newAddress.address.street"));
    }

    public WebElement getAptSuite() {
        return driver.findElement(By.id("checkout.shipping.addressSelector.newAddress.address.street2"));
    }

    public WebElement getEmailField() {
        return driver.findElement(By.id("checkout.shipping.addressContactEmail.address.emailAddress"));
    }

    public WebElement getPhoneNoField() {
        return driver.findElement(By.id("checkout.shipping.addressContactPhone.address.fullDaytimePhone"));
    }

    public WebElement getContinueToPaymentBtn() {
        return driver.findElement(By.xpath("//button[@type='button']"));
    }

    public WebElement getCredidOrDebitBtn() {
        return driver.findElement(By.xpath("//div[@id='checkout.billing.billingOptions.options.0-selector']/div/label/div/div"));
    }

    public WebElement getCartNo() {
        return driver.findElement(By.name("cardNumber"));
    }

    public WebElement getExprDate() {
        return driver.findElement(By.name("expiration"));
    }

    public WebElement getSecurityCode() {
        return driver.findElement(By.name("securityCode"));
    }

    public WebElement getReviewOrderBtn() {
        return driver.findElement(By.xpath("(//button[@type='button'])[2]"));
    }


    public WebElement getFinalReviewName() {
        return driver.findElement(By.className("rs-iteminfo-title"));
    }

    public WebElement getFinalReviewQty() {
        return driver.findElement(By.xpath("//div[@class='rs-quantity-text']/span[2]"));
    }


}
