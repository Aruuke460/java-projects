package SelfPracticeTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAttrValue {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("htpps://www.google.com");

        driver.navigate().refresh();

        String imagesLink = driver.findElement(By.linkText("Images")).getAttribute("href");
        System.out.println(imagesLink);
    }
}
