import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Main {
    private static WebDriver chromeDriver;
    private static WebDriver firFoxDriver;

    @BeforeClass
    public static void beforeAll(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\97250\\ChromeDriver96\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\97250\\FireFoxDriver\\geckodriver.exe");
        chromeDriver = new ChromeDriver();
        firFoxDriver = new FirefoxDriver();
    }

    //1
    @Test
    public static void open_walla_chrome(){
        chromeDriver.get("https://www.walla.co.il");
    }

    //1
    @Test
    public static void ynet_firefox(){
        firFoxDriver.get("https://www.ynet.co.il/");
    }

    //2
    @Test
    public static void googleTranslate(){
        chromeDriver.get("https://translate.google.com/");
        WebElement element = chromeDriver.findElement(By.className("er8xn"));
        WebElement element1 = chromeDriver.findElement(By.cssSelector("textarea[aria-controls=kvLWu]"));
        System.out.println(element);
        System.out.println(element1);
    }

    //3
    @Test
    public static void youtube(){
        firFoxDriver.get("https://www.youtube.com/");
        WebElement element = firFoxDriver.findElement(By.id("logo-icon"));
        System.out.println(element);
    }

    //4
    @Test
    public static void selenium(){
        firFoxDriver.get("https://www.selenium.dev/");
        WebElement element = firFoxDriver.findElement(By.className("form-control"));
        System.out.println(element);
    }

    //5
    @Test
    public static void amazon_test(){
        chromeDriver.get("https://www.amazon.com/");
        String amazonTitle = "Amazon.com. Spend less. Smile more.";
        Assert.assertEquals(chromeDriver.getTitle(), amazonTitle);
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("Leather shoes");
    }

    //6
    @Test
    public static void translate_search(){
        chromeDriver.get("https://translate.google.com/");
        chromeDriver.findElement(By.className("er8xn")).sendKeys("שלום");
    }

    //7
    @Test
    public static void youtube_search_song(){
        chromeDriver.get("https://www.youtube.com/");
        chromeDriver.manage().window().maximize();
        WebElement search = chromeDriver.findElement(By.cssSelector("input[name=search_query]"));
        search.sendKeys("fix you");
        chromeDriver.findElement(By.id("search-icon-legacy")).click();
    }

    //8
    @Test
    public static void facebook_test(){
        chromeDriver.get("https://www.facebook.com/");
        chromeDriver.findElement(By.id("email")).sendKeys("noashapiro@gmail.com");
        chromeDriver.findElement(By.id("pass")).sendKeys("Noamay");
        chromeDriver.findElement(By.cssSelector("button[name=login]")).click();
    }

    @AfterClass
    public static void afterAll(){
        chromeDriver.quit();
        firFoxDriver.quit();
    }
}
