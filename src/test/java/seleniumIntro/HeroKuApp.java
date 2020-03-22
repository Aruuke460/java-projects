package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeroKuApp {
//    TC #3: HerokuApp URL verification
//    1.Open Chrome browser
//    2.Go to https://the-internet.herokuapp.com/forgot_password
 //   3.Enter any email into input box
//    4.Click on Retrieve password
//    5.Verify URL contains:
//    Expected: “email_sent”
//    6.Verify that text box displayed has the text as expected
//    Expected: "Your e-mail's been sent!"
      public static void main(String[] args) {
          WebDriverManager.chromedriver().setup();
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();

          driver.get("https://the-internet.herokuapp.com/forgot_password");
          driver.findElement(By.id("email")).sendKeys("example@gmail.com");
          driver.findElement(By.id("form_submit")).click();

          String actualUrl = driver.getCurrentUrl();
          String expectedInUrl = "email_sent";

          if(actualUrl.contains(expectedInUrl)){
              System.out.println("Url verification PASSED!");
          }else{
              System.out.println("Url verification is FAILED");
          }

          String actualTextBoxValue = driver.findElement(By.id("content")).getText();
          String expectedTextBoxValue = "Your e-mail's been sent!";
          if(actualTextBoxValue.equals(expectedTextBoxValue)){
              System.out.println("Text box value verification PASSED!");
          }else{
              System.out.println("Text box value verification FAILED!");
          }
      }

}



