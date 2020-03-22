package SeleniumTasks.Tuesday;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);
        driver.findElement(By.name("btnK"));

        String actualTitle = driver.getTitle();
        String expectedTitle = "apple";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
    }
}
