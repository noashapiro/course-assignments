import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Solutions {
    private static ChromeDriver driver;
    @BeforeClass
    public static void BeforeTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\97250\\ChromeDriver96\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    //1
    @Test
    public static void Calculator_dimensions(){
        driver.get("https://dgotlieb.github.io/WebCalculator");
        WebElement seven = driver.findElement(By.id("seven"));
        System.out.println(seven.getRect().getDimension());
    }

    @Test
    public static void Calculator_6_displayed(){
        driver.get("https://dgotlieb.github.io/WebCalculator");
        driver.findElement(By.id("six")).isDisplayed();
    }

    @Test
    public static void Assertion_formula_test(){
        int num = 11;
        driver.get("https://dgotlieb.github.io/WebCalculator");
        driver.findElement(By.id("two")).click();
        driver.findElement(By.id("add")).click();
        driver.findElement(By.id("nine")).click();
        driver.findElement(By.id("equal")).click();
        int result = Integer.parseInt(driver.findElement(By.id("screen")).getText());
        Assert.assertEquals(num,result);
    }

    //2
    @Test
    public static void Assert_url(){
        String url = "https://www.facebook.com/";
        driver.get("https://www.facebook.com/");
        Assert.assertEquals(url, driver.getCurrentUrl());
    }

    //3
    @Test
    public static void Assert_title(){}
    @AfterClass
    public static void AfterClass(){
        driver.quit();
    }

}
