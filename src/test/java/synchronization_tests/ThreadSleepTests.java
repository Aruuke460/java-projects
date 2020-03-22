package synchronization_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.practice_cybertek_pages.DynamicLoading2Page;
import utilities.Driver;

public class ThreadSleepTests {

    @Test
    public void thradSleepTest(){
       //1. getting the page
        Driver.getDriver().get("https://practice.cybertekschool.com/dynamic_loading/2");

        //2.- creating object to be able to reach Page class' Webelements
        DynamicLoading2Page dynamicLoading2Page = new DynamicLoading2Page();

        //3 - Clicking to the start button using the object we created
        dynamicLoading2Page.startButton.click();

        //4- Assert the Webelement is displayed on the page
        Assert.assertTrue(dynamicLoading2Page.helloWorldText.isDisplayed(),
                "Text is NOT displayed on the page!");

    }

}
