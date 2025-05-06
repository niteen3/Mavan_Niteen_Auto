package testng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicOfTestng {

    @Test
    public void VerifyEdsoService() throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://edso.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.close();
    }
    @Test(groups="smoke")
    public void VerifyAmazon() throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://amazon.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void VerifyFlipkart() throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.close();
    }

}
