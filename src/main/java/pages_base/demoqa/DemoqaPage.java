package pages_base.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages_base.BasePage;

public class DemoqaPage extends BasePage {

    public DemoqaPage(WebDriver driver) {
        super(driver);
    }
    By elemets = By.xpath("(//div[contains(@class,'card mt-4')])[1]");
    By elementtext= By.xpath("//*[@id=\"item-0\"]");
    By fullname = By.xpath("//*[@id=\"userName\"]");
    By emailtext = By.xpath("//*[@id=\"userEmail\"]");
    By adresscurent = By.xpath("//*[@id=\"currentAddress\"]");
    By adresspermanent = By.xpath("//*[@id=\"permanentAddress\"]");
    By submit = By.xpath("//*[@id=\"submit\"]");
    By textadress = By.xpath("//*[@id=\"name\"]");
    By emailadress = By.xpath("//*[@id=\"email\"]");

    public DemoqaPage clickelements(){
        driver.findElement(elemets).click();
        driver.findElement(elementtext).click();
        return this;
    }
    public DemoqaPage sendtext(){
        driver.findElement(fullname).sendKeys("Ivanov Ivan");
        driver.findElement(emailtext).sendKeys("grt11@mail.ru");
        driver.findElement(adresscurent).sendKeys("445026 Togliatty ul.Revolutsionnaya 24-152");
        driver.findElement(adresspermanent).sendKeys("445026 Togliatty ul.Revolutsionnaya 24-152");
        driver.findElement(submit).click();
        Assert.assertEquals("Name:Ivanov Ivan",driver.findElement(textadress).getText());
        Assert.assertEquals("Email:grt11@mail.ru",driver.findElement(emailadress).getText());
        return this;
    }
}
