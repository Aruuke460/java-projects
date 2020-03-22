package aaaaSeleniumEx;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Selenium {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //it will continue work even it's not 10 seconds yet

        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        WebElement checkAllButton = driver.findElement(By.id("check1"));
        String expectedValue = "Check All";
        String actualText = checkAllButton.getAttribute("value");

        if(actualText.equals(expectedValue)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        checkAllButton.click();

        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@class ='cb1-element'])[1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@class ='cb1-element'])[2]"));
        WebElement checkBox3 = driver.findElement(By.xpath("(//input[@class ='cb1-element'])[3]"));
        WebElement checkBox4 = driver.findElement(By.xpath("(//input[@class ='cb1-element'])[4]"));

        if(checkBox1.isSelected() && checkBox2.isSelected() && checkBox3.isSelected() && checkBox4.isSelected()){
            System.out.println("All check boxes are checked.Passed");
        }else{
            System.out.println("Failed");
        }
        String expectedValueAfterClick = "Uncheck All";
        String actualValueAfterClick = checkAllButton.getAttribute("value");

        if(expectedValueAfterClick.equals(actualValueAfterClick)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
       // driver.close();
        driver.quit();



    }
}
