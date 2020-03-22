package testNg;
import org.testng.annotations.Test;
import utilities.Config;
import utilities.Driver;


public class LoginTest {
    @Test
    public void positiveLoginScenario(){

        String username = Config.getProperty("storemanageruser1");
        String password = Config.getProperty("storemanagerpassword");

        Driver.getDriver().get(Config.getProperty("vytrackUrl"));

        VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();
        vytrackLoginPage.usernameInput.sendKeys(username);
        vytrackLoginPage.passwordInput.sendKeys(password);
        vytrackLoginPage.loginButton.click();
    }
}


