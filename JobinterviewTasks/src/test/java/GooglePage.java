import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage extends BaseClass{
    private WebDriver driver;
    private By search = By.cssSelector("input[title=Search]");
    private By select = By.cssSelector("");
    private By result = By.cssSelector("");

    public GooglePage() {
        driver = Driver.getDriverInstance();
    }

    public void search(){
        SendKeys(search, "5 USD to ILS");
        ClickOnElement(select);
    }

    public String getText(){
        return getText(result);
    }


}
