package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNGannotations {

    public WebDriver driver;

    @BeforeMethod
    public void Beforemethod(){
        driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    }
    @Test
    public void LaunchRediffmail() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(2000);

    }
    @AfterMethod
    public void AfterMethod(){
        driver.close();
    }
}
