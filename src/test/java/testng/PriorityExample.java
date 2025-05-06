package testng;

import org.testng.annotations.Test;

public class PriorityExample {
    @Test(priority=5)
    public void verifyCaseA(){
        System.out.println("Verify case A");
    }
    @Test(priority=1)
    public void verifyCaseQ(){
        System.out.println("Verify case Q");
    }
    @Test(priority=3)
    public void verifyCaseC(){
        System.out.println("Verify case C");
    }
    @Test(priority=2)
    public void verifyCaseZ(){
        System.out.println("Verify case Z");
    }
    @Test(priority=4)
    public void verifyCaseB(){
        System.out.println("Verify case B");
    }
}
