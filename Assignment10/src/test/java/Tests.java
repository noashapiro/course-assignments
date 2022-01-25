import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class Tests {
    private static ChromeDriver driver;
    private static WebDriverWait wait;
    @BeforeClass
    public static void BeforeAll(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\97250\\ChromeDriver96\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Test
    public static void test01_ImplicitWait(){
        driver.get("https://dgotlieb.github.io/Selenium/synchronization.html");
        driver.findElement(By.id("btn")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/form/div[1]/text()"))));

    }

}
