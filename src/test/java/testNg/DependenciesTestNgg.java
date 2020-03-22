package testNg;


import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenciesTestNgg {
    @Test(priority = 2)
    public void login(){
        System.out.println("Logging in...");
        Assert.fail("On purpose fail");
    }
    @Test (priority = 1, dependsOnMethods = "login")
    public void makePurchase(){
        System.out.println("Making purchase...");
    }
    @Test
    public void homePage(){
        System.out.println("Homepage is tested...");
    }
}

