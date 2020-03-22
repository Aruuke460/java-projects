package actions_tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.amazon_pages.AmazonWeb;
import utilities.Driver;

public class AmazonWebTest {

    @Test
    public void signInLinkWebTest(){
        //1
        Driver.getDriver().get("https://.amazon.com");
        //2
        AmazonWeb amazonWeb = new AmazonWeb();
        //3
        Actions actions = new Actions(Driver.getDriver());
        //4
        actions.moveToElement(amazonWeb.signInLink).perform();

        //actions.moveToElement(amazonWeb.searchButton).click();

    }
}
