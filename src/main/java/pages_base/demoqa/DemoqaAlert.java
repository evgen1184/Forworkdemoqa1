package pages_base.demoqa;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages_base.BasePage;

import java.time.Duration;

public class DemoqaAlert extends BasePage {
    public DemoqaAlert(WebDriver driver){
        super(driver);}

    By alertbut = By.xpath("//*[@id=\"item-1\"]//span[contains(text(),'Alert')]");
    By alertclickbutton =   By.xpath("//*[@id=\"alertButton\"]");
    By alertfivesec = By.xpath("//*[@id=\"timerAlertButton\"]");
    By confirmbox = By.xpath("//*[@id=\"confirmButton\"]");

    By confirmmessage = By.xpath("//*[@id=\"confirmResult\"]");
    By promtbox = By.xpath("//*[@id=\"promtButton\"]");
    By promtmessage = By.xpath("//*[@id=\"promptResult\"]");




    public DemoqaAlert checkalerts(){
        driver.findElement(alertbut).click();
        driver.findElement(alertclickbutton).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.findElement(alertfivesec).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until((ExpectedConditions.alertIsPresent()));
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.findElement(confirmbox).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        Assert.assertEquals("You selected Ok",driver.findElement(confirmmessage).getText());
        driver.findElement(promtbox).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("Test name");
        driver.switchTo().alert().accept();
        Assert.assertEquals("You entered Test name",driver.findElement(promtmessage).getText());

        return this;

    }
}
