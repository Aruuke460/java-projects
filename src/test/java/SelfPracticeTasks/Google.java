package SelfPracticeTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");

        WebElement etsySearchBox = driver.findElement(By.id("global-enhancements-search-query"));
        etsySearchBox.sendKeys("flower");
        driver.findElement(By.className("wt-input-btn-group__btn")).click();

    }
}
