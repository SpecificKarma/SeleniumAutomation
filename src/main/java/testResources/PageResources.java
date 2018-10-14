package testResources;


import org.openqa.selenium.WebDriver;
import pages.BuyIPadPage;
import pages.CheckoutPage;
import pages.HomePage;

public class PageResources {
    public Data data;
    public HomePage homePage;
    public BuyIPadPage buyIPadPage;
    public CheckoutPage checkoutPage;

    public PageResources(WebDriver driver) {
        data = new Data();
        homePage = new HomePage(driver);
        buyIPadPage = new BuyIPadPage(driver);
        checkoutPage = new CheckoutPage(driver);
    }
}
