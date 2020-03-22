package SelfPracticeTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWednesday {
    public static void main(String[] args) {
//        TC#2 Search ETSY
//        1. Open browser
//        2. Go to https://etsy.com
//        3. Enter any search term
//        4. Click search button
//        5. Verify title contains the search term
//        USE XPATH TO LOCATE WEBELEMENTS
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");
        driver.findElement(By.xpath("search_query")).sendKeys("table");


    }
}
