package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;

import java.time.Duration;

import static Common.Config.*;

public class Commonaction {
    private static WebDriver driver = null;

    private Commonaction(){
    }
    public static WebDriver createDriver() {
        if (driver == null) {
            switch (Platform_and_Browser) {
                case "win_chrome":
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                default:
                    Assert.fail("Incorrect platform or browser name" + Platform_and_Browser);
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Implicity_wait));
        }
    return driver;
    }
}
