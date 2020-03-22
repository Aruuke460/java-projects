package reviewOfUtilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utilities.Config;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Dog {
    public static void main(String[] args) throws Exception {
//        Properties properties = new Properties();
//        FileInputStream file = new FileInputStream("review.properties");
       // System.out.println(Config.getProperty("color"));

       // FakeDriver.getDriver().get("https://www.google.com");
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com");
        GoogleHOmePage gh = new GoogleHOmePage();
        gh.searchBox.sendKeys("Apple" + Keys.ENTER);


    }
}
