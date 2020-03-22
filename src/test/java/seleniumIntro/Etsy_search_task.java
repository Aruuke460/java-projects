package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy_search_task {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");
        WebElement etsySearchBox =  driver.findElement(By.id("global-enhancements-search-query"));
        etsySearchBox.sendKeys("magnet");

        WebElement etsySearchButton = driver.findElement(By.className("wt-input-btn-group__btn"));
        etsySearchButton.click();

        String expectedTitle = "Magnet";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Magnet title is there");
        } else {
            System.out.println("Magnet title is NOT there - FAIL!");
        }

        driver.get("https://www.etsy.com");
        Thread.sleep(5000);
        driver.navigate().refresh();

        etsySearchBox.click();

        etsySearchBox.sendKeys("Apple iPhone 11 case");
        etsySearchButton.click();

        String expectedIPHONETitle = "Apple iPhone 11 pro case";
        String actualIPHONETitle = driver.getTitle();

        if (actualIPHONETitle.contains(expectedIPHONETitle)) {
            System.out.println("Apple iPhone title is there");
        } else {
            System.out.println("Apple iPhone title is NOT there - FAIL!");
        }




        //go home page
          // etsySearchBox.sendKeys("apple");




        driver.quit();
    }
}
