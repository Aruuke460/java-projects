package SelfPracticeTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyFirstPrac {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        driver.navigate().to("https://www.etsy.com");
        System.out.println(driver.getTitle());

        driver.navigate().to("https://www.facebook.com");
        System.out.println(driver.getTitle());


        driver.close();
    }
}
