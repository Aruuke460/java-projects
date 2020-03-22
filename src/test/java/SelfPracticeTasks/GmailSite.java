package SelfPracticeTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSite {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.instagram.com");

        driver.findElement(By.id("email")).sendKeys("a_r_u_u_s_h_k_a");
        driver.findElement(By.name("pass")).sendKeys("ne"+ Keys.ENTER);
        driver.findElement(By.id("loginbutton")).click();
    }
}
