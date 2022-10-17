package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayLoginPage extends CommonMethods {

@FindBy (linkText = "Sign in")
public WebElement sigIn;

@FindBy (xpath = "//div[text()='Please verify yourself']")
public WebElement textToveriy;



    public EbayLoginPage(){
        PageFactory.initElements(driver,this);
    }
}


