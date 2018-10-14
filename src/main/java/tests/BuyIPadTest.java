package tests;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyIPadTest extends BaseTest {

    WebDriverWait wait = new WebDriverWait(driver, 100);

    @Test(priority = 0)
    void redirectToBuyIpadPageTest() {
        driver.get(page.data.iPadPage);
        actions.click(page.buyIPadPage.getBuyButton()).perform();
        Assert.assertEquals(page.buyIPadPage.getTitleName(), "Buy iPad 9.7-inch - Apple");
    }

    @Test(priority = 1)
    void setupIpadOptionsPurchaseTest() throws InterruptedException {
        actions.click(page.buyIPadPage.getSilverColorBtn()).perform();
        Thread.sleep(500);
//        wait.until(ExpectedConditions.elementToBeClickable(page.buyIPadPage.getStorageBtn()));
        actions.click(page.buyIPadPage.getStorageBtn()).perform();
        Thread.sleep(500);
        actions.click(page.buyIPadPage.getConnectivityBtn()).perform();
        Thread.sleep(500);
        actions.click(page.buyIPadPage.getAppleCareWindow()).perform();
        Thread.sleep(800);
        actions.click(page.buyIPadPage.getAppleCareClose()).perform();
        Thread.sleep(800);
        actions.click(page.buyIPadPage.getContinueBtn()).perform();

        Thread.sleep(500);
        Assert.assertEquals(page.buyIPadPage.getSummaryProduct().getText(), "iPad Wi-Fi 32GB - Silver");
    }

    @Test(priority = 2)
    void addToBagAndReviewTest() throws InterruptedException {
        Thread.sleep(500);
        actions.click(page.buyIPadPage.getAddToBagReviewBagBtn()).perform();
        page.buyIPadPage.getAddToBagReviewBagBtn().click();

        Assert.assertEquals(page.buyIPadPage.getItemName().getText(), "iPad Wi-Fi 32GB - Silver");
        Assert.assertEquals(new Select(page.buyIPadPage.getItemQty()).getFirstSelectedOption().getText(), "1");
    }

    @Test(priority = 3)
    void proceedToCheckout() {

        actions.click(page.buyIPadPage.getCheckOutBtn()).perform();
        actions.click(page.buyIPadPage.getProceedAsGuest()).perform();
        actions.click(page.buyIPadPage.getShippingAddressBtn()).perform();

        Assert.assertEquals(page.buyIPadPage.getHeaderCheckout().getText(), "Checkout");
    }

    @Test(priority = 4)
    void shippingDetailsTest() throws InterruptedException {
        actions.click(page.checkoutPage.getFirstNameTextField()).sendKeys(page.data.RandomUsername).perform();
        Thread.sleep(100);
        actions.click(page.checkoutPage.getLastNameTextField()).sendKeys(page.data.RandomUsername).perform();
        actions.click(page.checkoutPage.getStreetField()).sendKeys(page.data.RandomUsername).perform();
        actions.click(page.checkoutPage.getAptSuite()).sendKeys(page.data.RandomNumeric).perform();
        actions.click(page.checkoutPage.getEmailField()).sendKeys(page.data.RandomEmail).perform();
        actions.click(page.checkoutPage.getPhoneNoField()).sendKeys(page.data.RandomNumeric).perform();
        actions.click(page.checkoutPage.getContinueToPaymentBtn()).perform();
    }

    @Test(priority = 5)
    void paymentTest() throws InterruptedException {
        Thread.sleep(1000);
        actions.click(page.checkoutPage.getCredidOrDebitBtn()).perform();
        Thread.sleep(1000);
        //This is Generated Card Number by PayPal
        actions.click(page.checkoutPage.getCartNo()).sendKeys("4665 4855 8258 7987").perform();
        actions.click(page.checkoutPage.getSecurityCode()).sendKeys("389").perform();
        actions.click(page.checkoutPage.getExprDate()).sendKeys("04/28").perform();
        actions.click(page.checkoutPage.getReviewOrderBtn()).perform();

        Assert.assertEquals(page.checkoutPage.getFinalReviewName().getText(), "iPad Wi-Fi 32GB - Silver");
        Assert.assertEquals(page.checkoutPage.getFinalReviewQty().getText(), "1");
    }




}
