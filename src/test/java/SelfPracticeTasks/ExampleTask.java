package SelfPracticeTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleTask {
    public static void main(String[] args) {
//        TC#1 Search Amazon
//        1. Open browser
//        2. Go to https://amazon.com
//        3. Enter any search term
//        4. Click search button
//        5. Verify title contains the search term
//        USE CSS SELECTOR TO LOCATE WEBELEMENTS
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
       driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("car");

       driver.findElement(By.cssSelector("input[value='Go']")).click();



    }
}
