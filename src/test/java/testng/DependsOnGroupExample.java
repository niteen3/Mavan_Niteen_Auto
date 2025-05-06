package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupExample {
    @Test(groups= {"smoke"})
    public void verifyLogin(){
        Assert.assertTrue(true);
        System.out.println("Verify Login");
    }
    @Test(dependsOnGroups = "smoke")
    public void verifyPayments(){
        System.out.println("Verify Payments");
    }
    @Test
    public void verifyOnboarding(){
        System.out.println("Verify Onboarding");
    }   
}
