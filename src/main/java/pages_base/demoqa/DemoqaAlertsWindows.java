package pages_base.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages_base.BasePage;

import java.time.Duration;
import java.util.Set;

public class DemoqaAlertsWindows extends BasePage {
    public DemoqaAlertsWindows(WebDriver driver){
        super(driver);}

    By newbutton= By.xpath("//*[contains(text(),'Alerts, Frame & Windows')]");
    By browserbutton = By.xpath("//*[@id=\"item-0\"]//span[contains(text(),'Browser')]");
    By newtab = By.xpath("//*[@id=\"tabButton\"]");
    By newwindow = By.xpath("//*[@id=\"windowButton\"]");


    public DemoqaAlertsWindows checktabandwindows(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,700)");
        driver.findElement(newbutton).click();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(browserbutton)).click();
        String parentHandle = driver.getWindowHandle();
        driver.findElement(newtab).click();
        Set<String> handles = driver.getWindowHandles();
        for(String handle: handles){
            if(!handle.equals(parentHandle)){
                driver.switchTo().window(handle);
                driver.close();
            }
        }
        driver.switchTo().window(parentHandle);
        driver.findElement(newwindow).click();
        Set<String> handles1 = driver.getWindowHandles();
        for(String handle: handles1){
            if(!handle.equals(parentHandle)){
                driver.switchTo().window(handle);
                driver.close();
            }
        }
        driver.switchTo().window(parentHandle);

        return this;


    }
}
