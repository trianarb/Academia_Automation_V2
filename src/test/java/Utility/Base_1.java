package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_1 {

    public WebDriver driver;
    protected WebElement webElement;

    public Base_1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static class UtilsDriver {
        public static String BASE_URL = "https://formy-project.herokuapp.com/form";
        public static String FireFox_DRIVER_LOCATION = "C:\\Users\\gabriel.velez\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe";

    }
}
