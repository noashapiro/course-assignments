import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseClass {

    public void SendKeys(By locator, String keys){
        getWebElement(locator).sendKeys(keys);
    }
    public void ClickOnElement(By locator){
        getWebElement(locator).click();
    }

    public String getText(By locator){
        return getWebElement(locator).getText();
    }
    private WebElement getWebElement(By locator) {
        return Driver.getDriverInstance().findElement(locator);
    }

}
