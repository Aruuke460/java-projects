package SelfPracticeTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfCheckBrowsers {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.westernunion.com");
        System.out.println(driver.getTitle());

        driver.navigate().back();

        driver.navigate().forward();
        driver.navigate().refresh();


        driver.navigate().to("https://google.com");
        System.out.println(driver.getTitle());

        driver.close();
    }
}
