import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.close();
    }
}
