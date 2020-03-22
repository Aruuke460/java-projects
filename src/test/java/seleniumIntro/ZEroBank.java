package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZEroBank {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");
       String actualPageHeader= driver.findElement(By.className("page-header")).getText();

       if(actualPageHeader.equals("Log in to ZeroBank")){
           System.out.println("Passed");
       }else {
           System.out.println("failed");
       }

       driver.quit();

    }
}
