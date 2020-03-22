package SelfPracticeTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IGcheck {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver22 = new ChromeDriver();
        driver22.manage().window().maximize();

        driver22.get("https://www.facebook.com");
        Thread.sleep(3000);

        driver22.findElement(By.name("username")).sendKeys("aruuke");
        driver22.findElement(By.name("username")).sendKeys("passwd" + Keys.ENTER);

    }
}
