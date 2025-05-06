package testng;

import org.testng.annotations.*;

public class TestNGAnnotationSecondExample {
    @BeforeSuite
    public void BeforeSuit(){
        System.out.println("Before Suit");
    }

    @BeforeTest
    public void BeforeTest(){
        System.out.println("Before Test");
    }

    @BeforeClass
    public void BeforeClass(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("Before Method");
    }
    @Test
    public void Testcase_1(){
        System.out.println("Testcase 1");
    }
    @Test
    public void Testcase_2(){
        System.out.println("Testcase 2");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("After method");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("After Class");
    }
    @AfterMethod
    public void AfterTest(){
        System.out.println("After Test");
    }
    @AfterSuite
    public void AfterSuit(){
        System.out.println("After Suit");
    }
}
