import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public static void Assert_title(){
        driver.get("https://www.facebook.com/");
        driver.navigate().refresh();
        String title="Facebook - Log In or Sign Up";
        Assert.assertEquals(title, driver.getTitle());
    }

    //4
    @Test
    public static void Extensions(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-extensions");
        driver = new ChromeDriver(chromeOptions);
    }

    //5
    @Test
    public static void Actions(){
        driver.navigate().to("https://dgotlieb.github.io/Actions/");
        WebElement box = driver.findElement(By.id("div1"));
        File screenShotFile = box.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenShotFile, new File("element-screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public static void Double_Click(){
        driver.navigate().to("https://dgotlieb.github.io/Actions/");
        WebElement doubleClickElement =
                driver.findElement(By.xpath("//p[@ondblclick='doubleClickFunction()']"));
        Actions doubleClickAction = new Actions(driver);
        doubleClickAction.doubleClick(doubleClickElement);
        doubleClickAction.build().perform();

        String result = driver.findElement(By.id("demo")).getText();
        Assert.assertEquals("You double clicked", result);
    }

    @Test
    public void test04_mosueHover() {
        Actions hoverAction = new Actions(driver);
        WebElement firstHoverElement = driver.findElement(By.id("demo"));
        WebElement secondHoverElement = driver.findElement(By.id("close"));
        hoverAction.moveToElement(firstHoverElement)
                .moveToElement(secondHoverElement)
                .click()
                .build()
                .perform();
    }

    @Test
    public void test05_selectMultiple() {
        List<WebElement> elementsList = driver.findElements(By.name("kind"));
        Actions builder = new Actions(driver);
        builder.clickAndHold(elementsList.get(0)).clickAndHold(elementsList.get(2)).click();
        builder.build().perform();
    }

    @Test
    public void test06_uploadFile() {
        driver.findElement(By.name("pic")).sendKeys("1.txt");
    }

    @Test
    public void test07_scrollToElement() throws InterruptedException {
        WebElement element = driver.findElement(By.id("clickMe"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(4000);
    }
    @Test
    public void test08_scrollToLocation() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
        Thread.sleep(4000); // this is here just to see the move after the scroll
    }

    //6
    @Test
    public void test01_clickCheese(){
        driver.navigate().to("https://dgotlieb.github.io/Controllers/");
        List<WebElement> list = driver.findElements(By.name("group1"));// exercise b
        for (WebElement tempElement : list) {
            if (tempElement.getAttribute("value").equals("Cheese")) {
                tempElement.click();
            }
            System.out.println(tempElement.getAttribute("value"));
        }
        Select selection = new Select(driver.findElement(By.name("dropdownmenu")));
        selection.selectByValue("Milk");
        for (int i = 0; i < selection.getOptions().size(); i++) {
            System.out.println(selection.getOptions().get(i).getText());
        }
    }

    // 7
    @Test
    public void test10_calculator_dimensions() {
        driver.get("https://dgotlieb.github.io/WebCalculator/");
        System.out.println(driver.findElement(By.id("two")).getRect().getHeight());
        System.out.println(driver.findElement(By.id("six")).getRect().getWidth());
    }

    //8
    @Test
    public void test01_theMarker() throws InterruptedException {
        driver.get("https://www.themarker.com/");
        Thread.sleep(3000); // make sure (some) of the page loaded
        String in = driver.getPageSource();
        int i = 0;
        Pattern p = Pattern.compile("news");
        Matcher m = p.matcher(in);
        while (m.find()) {
            i++;
        }
        System.out.println(i);
    }

    //9
    @Test
    public void test01_JSExecutor(){
        ((JavascriptExecutor)driver).executeScript("window.print();");
    }


    @AfterClass
    public static void AfterClass(){
        driver.quit();
    }

}
