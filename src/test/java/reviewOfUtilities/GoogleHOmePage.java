package reviewOfUtilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GoogleHOmePage {
    public GoogleHOmePage(){
        PageFactory.initElements(Driver.getDriver(),this);
        //synchronize the pages and elements
        //makes all below web elements ready to use

    }
    @FindBy(name = "q")
    public WebElement searchBox;
}
