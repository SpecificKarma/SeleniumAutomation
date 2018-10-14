package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public final WebElement getIpadButton() {
        return driver.findElement(By.linkText("iPad"));
    }

    public final String getPageTitle() {
        return driver.getTitle();
    }
}
