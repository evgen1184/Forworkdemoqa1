package pages_base.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages_base.BasePage;

public class DemoqaButtons extends BasePage {
    public DemoqaButtons(WebDriver driver){super(driver);}

    By buttons = By.xpath("//*[@id=\"item-4\"]");
    By buttonclick = By.xpath("//div[@class=\"mt-4\"][2]//button");

    By dynamicmessage = By.xpath("//*[@id=\"dynamicClickMessage\"]");
    By rightbutton = (By.xpath("//*[@id=\"rightClickBtn\"]"));
    By messageclick = By.xpath("//*[@id=\"rightClickMessage\"]");
    By doubleclickbutton = By.xpath("//*[@id=\"doubleClickBtn\"]");
    By doublevlickmes = By.xpath("//*[@id=\"doubleClickMessage\"]");




    public DemoqaButtons checkbuttons(){
        driver.findElement(buttons).click();
        driver.findElement(buttonclick).click();
        Assert.assertEquals("You have done a dynamic click",driver.findElement(dynamicmessage).getText());
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(rightbutton)).build().perform();
        Assert.assertEquals("You have done a right click", driver.findElement(messageclick).getText());
        Actions actions1 = new Actions(driver);
        actions1.doubleClick(driver.findElement(doubleclickbutton)).build().perform();
        Assert.assertEquals("You have done a double click", driver.findElement(doublevlickmes).getText());
        return this;
    }
}
