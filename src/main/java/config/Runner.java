package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.TestNG;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        try {
            if (args[0].contains("-firefox")) {

                driver = new FirefoxDriver();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        TestNG runner = new TestNG();

        List<String> suitefiles = new ArrayList<String>();
        suitefiles.add(String.valueOf(new File("src/main/resources/Suite1.xml")));
        runner.setTestSuites(suitefiles);

        runner.run();
    }

}
//                System.setProperty("webdriver.gecko.driver", new File("src/main/Lib/geckodriver.exe")+"");
//                System.setProperty("webdriver.chrome.driver", new File("src/main/Lib/chromedriver.exe")+"");