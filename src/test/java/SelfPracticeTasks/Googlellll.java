package SelfPracticeTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlellll {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.walmart.com");
        driver.findElement(By.xpath("//*[@id='global-search-input']")).sendKeys("jeans");
        driver.findElement(By.xpath("//*[@id='global-search-submit']/span")).click();

    // driver.close();
    }
}
