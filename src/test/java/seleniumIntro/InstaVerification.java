package seleniumIntro;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class InstaVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.instagram.com/accounts/login/?source=auth_switcher");
        Thread.sleep(2000);

        driver.findElement(By.name("username")).sendKeys("a_r_u_u_s_h_k_a");
        driver.findElement(By.name("password")).sendKeys("newlife27" + Keys.ENTER);
        driver.findElement(By.className("sqdOP  L3NKy   y3zKF     ")).click();

        Thread.sleep(3000);
        driver.close();
    }
}