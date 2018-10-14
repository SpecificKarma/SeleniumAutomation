package tests;

import config.Runner;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import testResources.PageResources;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Runner {

    PageResources page = new PageResources(driver);
    Actions actions = new Actions(driver);

    @BeforeTest
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
