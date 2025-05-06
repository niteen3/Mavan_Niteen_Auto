package testng;

import org.testng.annotations.Test;

public class InvocationCount {
    @Test(invocationCount=500 ,invocationTimeOut = 1)
    public void TestDemo(){
        System.out.println("How ar you?");
    }
}
