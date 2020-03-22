package pages.amazon_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonWeb {

    public AmazonWeb(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "nav-link-accountList")
    public WebElement signInLink;

//    @FindBy(id = "twotabsearchtextbox")
//    public WebElement searchButton;



}
