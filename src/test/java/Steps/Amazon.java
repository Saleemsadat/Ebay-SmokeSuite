package Steps;

import Utils.CommonMethods;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon extends CommonMethods {

    @When("I click on add, single item should be added")
    public static void runAmazon() {
        String url = "https://www.amazon.com/gp/css/homepage.html?ref_=nav_youraccount_btn";
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:/Users/salee/Desktop/Syntax Technologies/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }
}
