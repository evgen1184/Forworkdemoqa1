package ClickElement;

import org.testng.annotations.Test;
import Base_test.BaseTest;

public class ClickbuttonElementTest extends BaseTest {
    @Test

    public void checkisredirect() {

        basePage.open("https://demoqa.com/");
        demoqaPage.clickelements();
        demoqaPage.sendtext();
        demoqaButtons.checkbuttons();
        demoqaAlertsWindows.checktabandwindows();
        demoqaAlert.checkalerts();
    }
}