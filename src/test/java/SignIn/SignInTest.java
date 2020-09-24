package SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignInTest {
    private WebDriver driver;
    public void setUp() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.findElement(By.id("username")).sendKeys("ayoba");
        driver.findElement(By.id("password")).sendKeys("123456abc");
        driver.findElement(By.xpath ("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click();
        Thread.sleep (10000);
        driver.quit();
    }
    public static void main(String args[]) throws InterruptedException {
        SignInTest test = new SignInTest();
        test.setUp();


    }
}
