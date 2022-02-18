import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AllTests {
    private static WebDriver driver;
    private static AmazonPage amazonPage = new AmazonPage();
    private static GooglePage googlePage = new GooglePage();
    @BeforeClass
    public static void BeforeAll(){
        driver=Driver.getDriverInstance();

    }

    @Test
    public void SelectLeptop(){
        driver.get("https://www.amazon.com/");
        amazonPage.Search();
        amazonPage.Select();
    }

    @Test
    public void GoogleTest(){
        driver.get("https://www.google.com/");
        googlePage.search();
        googlePage.getText();
    }

}
