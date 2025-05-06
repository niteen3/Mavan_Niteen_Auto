package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {

    @Test
    public void verifyLogin(){
        Assert.assertTrue(true);
        System.out.println("Verify Login");
    }
    @Test(dependsOnMethods = "verifyLogin")
    public void verifyHomePage(){
        System.out.println("Verify HomePage");
    }
    @Test
    public void verifyOnboarding(){
        System.out.println("Verify Onboarding");
    }
}
