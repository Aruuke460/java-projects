package mentoring.tuesday.amazon;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AmazonPage extends BasePage {

        String url = "https://www.amazon.com/";
        @Test
        public void navigateTo () {
        driver.get(url);
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertEquals(url, actualUrl);
    }
        //Expected size = 47
        @Test
        public void validateCategroriesSize () {
        driver.get(url);
        driver.findElement(By.id("nav-hamburger-menu")).click();
        int expCategoriesSize = 47;
        List<WebElement> categoriesList = driver
                .findElements(By.cssSelector("ul.hmenu-visible li"));
        Assert.assertEquals(expCategoriesSize, categoriesList.size());
    }
        public void clickCategory (String categorName){
        driver.findElement(By.xpath("//*[.='" + categorName + "']")).click();
    }
    }
