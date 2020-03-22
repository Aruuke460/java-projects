package pages.Vytrack_pages.vytrackLoginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VYTrackLoginPage {
    public VYTrackLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id = "prependedInput")
        public WebElement usernameInput;
    @FindBy(id = "prepended Input2")
        public WebElement passwordInput;
    @FindBy(id = "_submit")
        public WebElement loginButton;
}
