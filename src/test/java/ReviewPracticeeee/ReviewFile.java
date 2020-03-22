package ReviewPracticeeee;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class ReviewFile {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        FileInputStream file = new FileInputStream("practice.properties");
        properties.load(file);
      //  String s = properties.getProperty("day");
       // System.out.println(s);

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(properties.getProperty("url"));
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys(properties.getProperty("cat")
                + Keys.ENTER);
        System.out.println(driver.getTitle());
        driver.quit();
        }
    }