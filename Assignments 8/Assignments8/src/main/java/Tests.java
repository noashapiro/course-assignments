import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tests {
    private static WebDriver driver;

    @Test
    public static void Chrome_Test(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\97250\\ChromeDriver96\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.walla.co.il");
    }

    @Test
    public static void FireFox_Test(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\97250\\FireFoxDriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.ynet.co.il/");
    }
}
