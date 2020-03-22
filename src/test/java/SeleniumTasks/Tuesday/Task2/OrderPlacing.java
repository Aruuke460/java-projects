package SeleniumTasks.Tuesday.Task2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrderPlacing {
    public static void main(String[] args) {
        /* TC#2: Smartbear software order placing
        1.Open	browser
        2.Go	to	website:	http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        3.Enter username: “Tester”
        4.Enter password: “test”
        5.Click on Login button
        6.Click on Order
        7.Select familyAlbum from product, set quantity to 2
        8.Click to “Calculate”button
        9.Fill address Info with JavaFaker•Generate: name, street, city, state, zip code
        10.Click on “visa” radio button
        11.Generate card number using JavaFaker
        12.Click on “Process”
        13.Verify success message “New order has been successfully added.
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        WebElement inputUsername = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        inputUsername.sendKeys("Tester");
        inputPassword.sendKeys("test");
        loginButton.click();

       // WebElement orderButton = driver.findElement(By.name("<a href="">Order</a>"));
        //orderButton.click();
        //WebElement orderButton = driver.findElement();
        driver.navigate().forward();



    }
}
