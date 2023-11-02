package Base_test;

import Common.Commonaction;
import org.openqa.selenium.WebDriver;
import pages_base.BasePage;
import pages_base.demoqa.DemoqaAlert;
import pages_base.demoqa.DemoqaAlertsWindows;
import pages_base.demoqa.DemoqaButtons;
import pages_base.demoqa.DemoqaPage;

public class BaseTest {
    protected WebDriver driver = Commonaction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected DemoqaPage demoqaPage = new DemoqaPage(driver);
    protected DemoqaButtons demoqaButtons = new DemoqaButtons(driver);
    protected DemoqaAlertsWindows demoqaAlertsWindows= new DemoqaAlertsWindows(driver);
    protected DemoqaAlert demoqaAlert = new DemoqaAlert(driver);

}
