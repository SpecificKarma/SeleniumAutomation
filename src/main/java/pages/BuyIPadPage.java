package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyIPadPage {

    private final WebDriver driver;

    public BuyIPadPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getBuyButton() {
        return driver.findElement(By.linkText("Buy"));
    }

    public String getTitleName() {
        return driver.getTitle();
    }

    public WebElement getSilverColorBtn() {
        return driver.findElement(By.xpath("//*[@id=\"dimensionColor-silver\"]"));
    }

    public WebElement getStorageBtn() {
        return driver.findElement(By.id("Item2-dimensionCapacity-32gb"));
    }

    public WebElement getConnectivityBtn() {
        return driver.findElement(By.id("Item3-dimensionConnection-wifi"));
    }

    public WebElement getAppleCareWindow() {
        return driver.findElement(By.id("applecareplus_add_applecareplus_open"));
    }

    public WebElement getAppleCareClose() {
        return driver.findElement(By.xpath("//div[3]/div/button/span"));
    }

    public WebElement getContinueBtn() {
        return driver.findElement(By.name("proceed"));
    }

    public WebElement getSummaryProduct() {
        return driver.findElement(By.xpath("//div[@id='page']/sticky/div/div/div/span"));
    }

    public WebElement getAddToBagReviewBagBtn() {
        return driver.findElement(By.xpath("//form[@id='summaryheader-form']/div/span/button/span"));
    }

    public WebElement getItemQty() {
        return driver.findElement(By.tagName("select"));
    }

    public WebElement getItemName() {
        return driver.findElement(By.linkText("iPad Wi-Fi 32GB - Silver"));
    }

    public WebElement getCheckOutBtn() {
        return driver.findElement(By.id("shoppingCart.actions.checkout"));
    }

    public WebElement getProceedAsGuest() {
        return driver.findElement(By.id("guest-checkout"));
    }

    public WebElement getShippingAddressBtn() {
        return driver.findElement(By.xpath("(//button[@type='button'])[3]"));
    }

    public WebElement getHeaderCheckout() {
        return driver.findElement(By.
                xpath("//div[@id='rr-sticky-checkout.companionBar_companionBar.stickyCompanionBar']/div/div/div"));
    }


}
