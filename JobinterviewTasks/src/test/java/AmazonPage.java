import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonPage extends BaseClass{

    private By searchBox = By.id("twotabsearchtextbox");
    private By search = By.id("nav-search-submit-button");
    private By chooseResult = By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img");
    private WebDriver driver;

    public AmazonPage(){
        driver = Driver.getDriverInstance();
    }
    public void Search(){
        SendKeys(searchBox, "laptop");
        ClickOnElement(search);
    }

    public void Select(){
        ClickOnElement(chooseResult);
    }
}
