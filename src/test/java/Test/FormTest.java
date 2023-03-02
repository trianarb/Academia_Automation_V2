package Test;

import Steps.FormSteps;
import Utility.Base_1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FormTest {
    public FirefoxDriver driver = new FirefoxDriver();

    @BeforeSuite
    public void setting() {
        //FirefoxDriver location set up in Utils class
       // System.setProperty("webdriver.gecko.driver", Base_1.UtilsDriver.FireFox_DRIVER_LOCATION);
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\gabriel.velez\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe");
        driver.get(Base_1.UtilsDriver.BASE_URL);
    }

    @Test
    public void SubmitForm () {
       // System.setProperty("webdriver.gecko.driver", "C:\\Users\\gabriel.velez\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe");
        //FirefoxDriver driver = new FirefoxDriver();
        ///driver.get("www.google.com");
        FormSteps actions = new FormSteps();
        actions.enterFirstName();
        actions.Click_Highest_level_of_education();


    }

    @AfterSuite
    public void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }

}