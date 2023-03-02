package Steps;
import Page.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FormSteps extends HomePage{

    public FormSteps(FirefoxDriver driver) {
        super(driver);
    }

    public void enterFirstName(){
        String first_name = "Gabriel";
        this.first_name.sendKeys(first_name);
    }
    public void Click_Highest_level_of_education(){
        this.college.click();
    }


}
