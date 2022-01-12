import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    private static WebDriver chromeDriver;
    private static WebDriver firFoxDriver;


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\97250\\ChromeDriver96\\chromedriver.exe");
        chromeDriver = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver","C:\\Users\\97250\\FireFoxDriver\\geckodriver.exe");
        firFoxDriver = new FirefoxDriver();

        answerThree();
        answerFour();
    }

    public static void answerThree(){
        chromeDriver.get("https://translate.google.com/");
        WebElement element = chromeDriver.findElement(By.className("er8xn"));
        WebElement element1 = chromeDriver.findElement(By.cssSelector("textarea[aria-controls=kvLWu]"));
        System.out.println(element);
        System.out.println(element1);
        chromeDriver.quit();
    }

    public static void answerFour(){
        firFoxDriver.get("https://www.youtube.com/");
        WebElement element = firFoxDriver.findElement(By.id("logo-icon"));
        System.out.println(element);
        firFoxDriver.quit();

    }
}
