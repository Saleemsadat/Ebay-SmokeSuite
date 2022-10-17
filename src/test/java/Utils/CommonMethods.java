package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {


    public static WebDriver driver;

/*
This method is to set up browser
 */
    public static void setUp() {
        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        if ("chrome".equals(ConfigReader.getPropertyValue("browser"))) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().window().maximize();
    }

    /*
    This method is to send text
     */

    public static void sendText(WebElement element, String textToSend) {
        element.clear();
        element.sendKeys(textToSend);
    }

    /*
    This method is to click
     */
    public static void click(WebElement element) {

        element.click();
    }

    /*
    This method is to get text for verification
     */

    public static String getText(WebElement element){

        String text=element.getText();
        System.out.println(text);
        return text;

    }

    /*
    This method is to make assertion
     */

    public static void makeAssertion(){




    }


    public static void tearDown(){
        driver.close();
    }


}
